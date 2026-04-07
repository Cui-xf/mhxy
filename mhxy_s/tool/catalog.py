#!/usr/bin/env python3
"""
catalog.py — 扫描所有 res/ 资源，生成 JSON 清单 tool/catalog.json

清单结构：
  {
    "sprites":    [{"id": 22, "source": "role", "png": "role/22.png", "slices": [...]}],
    "animations": [{"id": 100, "source": "role", "frames": [{"pieces": [...]}], "interval_ms": N}],
    "ui_sprites":    [...],
    "ui_animations": [...],
    "skill_sprites": [...],
    "skill_animations": [...],
    "cartoon_sprites": [...],
    "cartoon_animations": [...],
    "publicUI_sprites": [...],
    "publicUI_animations": [...],
    "petfight_sprites": [...],
    "petfight_animations": [...],
    "map_sprites": [...],
    "images": [...]
  }

每个 sprite 条目:
  {id, source, png, w, h, slices:[{x,y,w,h}]}

每个 animation 条目:
  {id, source, frame_count, interval_ms,
   frames: [{pieces:[{sprite_id, slice_idx, x, y, transform}]}]}

每个 map_sprite 条目（TileMap 地图文件）:
  {id, key, source:"map", png:"map/<key>.png", w, h, slices:[...]}
"""

import json
import os
import struct

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
RES_DIR  = os.path.join(BASE_DIR, "res")
OUT_DIR  = os.path.join(BASE_DIR, "tool", "out")
CATALOG_PATH = os.path.join(BASE_DIR, "tool", "catalog.json")

SKIP_BYTES = "版权归苏龙德所有".encode("utf-8")


# ── 底层解析 ────────────────────────────────────────────────────────────────

def read_chunks(data: bytes):
    """
    读取单独 rpg 文件的 chunks。
    格式: short(id) + byte(0) + byte(nchunks) + [int size + data]*nchunks
    返回 (id:int, nchunks:int, chunks:[bytes])
    """
    if len(data) < 4:
        return None
    file_id = struct.unpack_from(">h", data, 0)[0]
    nchunks = data[3]
    pos = 4
    chunks = []
    for _ in range(nchunks):
        if pos + 4 > len(data):
            break
        size = struct.unpack_from(">I", data, pos)[0]; pos += 4
        chunks.append(data[pos:pos+size]); pos += size
    return file_id, nchunks, chunks


def parse_rule(rule_path: str):
    """返回 [(key:int, id:int), ...]"""
    with open(rule_path, "rb") as f:
        data = f.read()
    count = struct.unpack_from(">H", data, 0)[0]
    pos = 2
    entries = []
    for _ in range(count):
        key = struct.unpack_from(">I", data, pos)[0]; pos += 4
        rid = struct.unpack_from(">H", data, pos)[0]; pos += 2
        entries.append((key, rid))
    return entries


def parse_pack_rpg(rpg_path: str, rule_count: int):
    """
    返回 list of (type:int, chunks:[bytes])
    """
    with open(rpg_path, "rb") as f:
        data = f.read()
    pos = len(SKIP_BYTES)
    frames = []
    for _ in range(rule_count):
        if pos >= len(data):
            break
        ftype   = data[pos]; pos += 1
        nchunks = data[pos]; pos += 1
        chunks = []
        for _ in range(nchunks):
            if pos + 4 > len(data):
                break
            size = struct.unpack_from(">I", data, pos)[0]; pos += 4
            chunks.append(data[pos:pos+size]); pos += size
        frames.append((ftype, chunks))
    return frames


# ── 解析 Sprite chunk[0] → slices ──────────────────────────────────────────

def parse_slices(chunk0: bytes, img_w: int, img_h: int):
    """
    chunk[0] 格式: skip(2) + byte(n_slices) + [short x, short y, short w, short h] * n
    n_slices == 0 → 整张图算一个 slice
    """
    if not chunk0 or len(chunk0) < 3:
        return [{"x": 0, "y": 0, "w": img_w, "h": img_h}]
    n = chunk0[2]
    if n == 0:
        return [{"x": 0, "y": 0, "w": img_w, "h": img_h}]
    slices = []
    pos = 3
    for _ in range(n):
        if pos + 8 > len(chunk0):
            break
        x, y, w, h = struct.unpack_from(">hhhh", chunk0, pos); pos += 8
        slices.append({"x": x, "y": y, "w": w, "h": h})
    return slices


def parse_sprite_info(chunks, png_rel_path):
    """从 chunks 中解析 Sprite 元数据，返回 dict"""
    if len(chunks) < 2 or not chunks[1] or len(chunks[1]) < 8:
        return None
    w = struct.unpack_from(">I", chunks[1], 0)[0]
    h = struct.unpack_from(">I", chunks[1], 4)[0]
    slices = parse_slices(chunks[0] if chunks else b"", w, h)
    return {"png": png_rel_path, "w": w, "h": h, "slices": slices}


# ── 解析 Animation chunk[0] ─────────────────────────────────────────────────

def parse_animation_info(chunks):
    """
    Animation chunk[0] 格式（来自 Animation.a(byte[][])）:
      byte frame_count
      short bbox_x, short bbox_y, short bbox_w, short bbox_h
      for each frame:
        byte piece_count
        for each piece:
          short sprite_id, byte type, short x, short y, short slice_idx, byte transform
      short interval_ms
    返回 dict 或 None
    """
    if not chunks or not chunks[0] or len(chunks[0]) < 1:
        return None
    chunk = chunks[0]
    frame_count = chunk[0]
    if frame_count == 0:
        return None
    pos = 1
    if pos + 8 > len(chunk):
        return None
    bbox_x, bbox_y, bbox_w, bbox_h = struct.unpack_from(">hhhh", chunk, pos); pos += 8
    frames = []
    for _ in range(frame_count):
        if pos >= len(chunk):
            break
        piece_count = chunk[pos]; pos += 1
        pieces = []
        for _ in range(piece_count):
            if pos + 9 > len(chunk):
                break
            sprite_id = struct.unpack_from(">h", chunk, pos)[0]; pos += 2
            piece_type = chunk[pos]; pos += 1
            x = struct.unpack_from(">h", chunk, pos)[0]; pos += 2
            y = struct.unpack_from(">h", chunk, pos)[0]; pos += 2
            slice_idx = struct.unpack_from(">h", chunk, pos)[0]; pos += 2
            transform = chunk[pos]; pos += 1
            pieces.append({
                "sprite_id": sprite_id,
                "type": piece_type,
                "x": x,
                "y": y,
                "slice_idx": slice_idx,
                "transform": transform,
            })
        frames.append({"pieces": pieces})
    interval_ms = 200
    if pos + 2 <= len(chunk):
        interval_ms = struct.unpack_from(">h", chunk, pos)[0]
    return {
        "frame_count": frame_count,
        "bbox": {"x": bbox_x, "y": bbox_y, "w": bbox_w, "h": bbox_h},
        "interval_ms": interval_ms,
        "frames": frames,
    }


# ── 目录 rpg 扫描（role / petfight / map）──────────────────────────────────

def scan_dir_rpg(src_dir: str, out_subdir: str, source_label: str):
    """
    扫描目录下所有 rpg，返回 (sprites, animations)。
    """
    if not os.path.isdir(src_dir):
        return [], []
    sprites = []
    animations = []
    for fname in os.listdir(src_dir):
        if not fname.endswith(".rpg"):
            continue
        raw_id = fname[:-4]  # 文件名（去掉 .rpg）
        fpath = os.path.join(src_dir, fname)
        with open(fpath, "rb") as f:
            raw = f.read()
        result = read_chunks(raw)
        if result is None:
            continue
        file_id, nchunks, chunks = result
        if nchunks >= 2:
            # Sprite
            png_rel = f"{out_subdir}/{raw_id}.png"
            info = parse_sprite_info(chunks, png_rel)
            if info:
                info["id"] = file_id
                info["source"] = source_label
                sprites.append(info)
        elif nchunks == 1:
            # Animation
            info = parse_animation_info(chunks)
            if info:
                info["id"] = file_id
                info["source"] = source_label
                animations.append(info)
    sprites.sort(key=lambda s: s["id"])
    animations.sort(key=lambda a: a["id"])
    return sprites, animations


# ── pack rpg 扫描（ui / publicUI / skill / cartoon）─────────────────────────

def scan_pack_rpg(rpg_name: str, out_subdir: str):
    """
    扫描 pack rpg，返回 (sprites, animations)。
    sprites 和 animations 各包含 id（来自 rule 文件）和 rule_index。
    """
    rpg_path  = os.path.join(RES_DIR, rpg_name + ".rpg")
    rule_path = os.path.join(RES_DIR, rpg_name + ".rule")
    if not os.path.isfile(rpg_path) or not os.path.isfile(rule_path):
        return [], []
    rule_entries = parse_rule(rule_path)
    frames = parse_pack_rpg(rpg_path, len(rule_entries))
    sprites = []
    animations = []
    for i, (ftype, chunks) in enumerate(frames):
        rule_key, rule_id = rule_entries[i] if i < len(rule_entries) else (0, i)
        if ftype == 0:
            png_rel = f"{out_subdir}/{i:04d}_id{rule_id}.png"
            info = parse_sprite_info(chunks, png_rel)
            if info:
                info["id"] = rule_id
                info["rule_index"] = i
                info["source"] = rpg_name
                sprites.append(info)
        else:
            info = parse_animation_info(chunks)
            if info:
                info["id"] = rule_id
                info["rule_index"] = i
                info["source"] = rpg_name
                animations.append(info)
    return sprites, animations


# ── images 目录 ──────────────────────────────────────────────────────────────

def scan_images():
    src = os.path.join(RES_DIR, "images")
    if not os.path.isdir(src):
        return []
    result = []
    for fname in sorted(os.listdir(src)):
        if fname.lower().endswith(".png"):
            result.append({"file": fname, "png": f"images/{fname}"})
    return result


# ── 主函数 ───────────────────────────────────────────────────────────────────

def main():
    catalog = {}

    print("扫描 role/ ...")
    sp, an = scan_dir_rpg(
        os.path.join(RES_DIR, "role"), "role", "role"
    )
    catalog["sprites"]    = sp
    catalog["animations"] = an
    print(f"  sprites={len(sp)}, animations={len(an)}")

    print("扫描 petfight/ ...")
    sp, an = scan_dir_rpg(
        os.path.join(RES_DIR, "petfight"), "petfight", "petfight"
    )
    catalog["petfight_sprites"]    = sp
    catalog["petfight_animations"] = an
    print(f"  sprites={len(sp)}, animations={len(an)}")

    print("扫描 map/ ...")
    sp, an = scan_dir_rpg(
        os.path.join(RES_DIR, "map"), "map", "map"
    )
    catalog["map_sprites"]    = sp
    catalog["map_animations"] = an
    print(f"  sprites={len(sp)}, animations={len(an)}")

    for pack_name in ["ui", "publicUI", "skill", "cartoon"]:
        print(f"扫描 {pack_name}.rpg ...")
        sp, an = scan_pack_rpg(pack_name, pack_name)
        catalog[f"{pack_name}_sprites"]    = sp
        catalog[f"{pack_name}_animations"] = an
        print(f"  sprites={len(sp)}, animations={len(an)}")

    print("扫描 images/ ...")
    catalog["images"] = scan_images()
    print(f"  {len(catalog['images'])} 张图片")

    with open(CATALOG_PATH, "w", encoding="utf-8") as f:
        json.dump(catalog, f, ensure_ascii=False, indent=2)

    # 统计
    total_sprites = sum(
        len(catalog.get(k, []))
        for k in catalog if k.endswith("sprites")
    )
    total_animations = sum(
        len(catalog.get(k, []))
        for k in catalog if k.endswith("animations")
    )
    print(f"\n清单已写入 {CATALOG_PATH}")
    print(f"  Sprites 合计:    {total_sprites}")
    print(f"  Animations 合计: {total_animations}")
    print(f"  Images:          {len(catalog['images'])}")


if __name__ == "__main__":
    main()
