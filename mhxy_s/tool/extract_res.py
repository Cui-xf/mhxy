#!/usr/bin/env python3
"""
res 资源提取脚本

格式说明（参考 Page.java / Frame0.java / Frame1.java）：

===================== rule 文件格式 =====================
  short count
  [int key, short id] * count

===================== 单独 rpg 文件（role/N.rpg）=====================
  short  id      (等于文件名数字)
  byte   0       (固定)
  byte   nchunks (数据块数量)
  对每块:
    int    size
    byte[size] data

  nchunks == 1 → Frame1 动画帧，chunk[0] 是 bx[][] 描述，无 PNG 图像
  nchunks >= 2 → Frame0 静态图：
    chunk[0] = aj 子区域描述（前2字节跳过，第3字节=数量，后续 short*4 * 数量）
    chunk[1] = IHDR (宽int+高int+位深+色彩类型+压缩+过滤+交错 + CRC4字节 = 17字节)
    chunk[2] = PLTE (调色板数据 + CRC4字节)
    chunk[3] = tRNS (透明度数据 + CRC4字节)
    chunk[4+] = IDAT (压缩像素数据 + CRC4字节)

===================== 包 rpg 文件（ui.rpg / publicUI.rpg 等）=====================
  bytes  skip = "版权归苏龙德所有" (UTF-8, 24字节)
  然后直接逐帧读取，帧数量由对应 .rule 文件决定：
  对每帧:
    byte   type    (0=Frame0静态图, 2=Frame1动画)
    byte   nchunks
    对每块:
      int    size
      byte[size] data
  块结构与单独 rpg 相同

===================== PNG 重建 =====================
  PNG_HEADER: 89 50 4E 47 0D 0A 1A 0A
  chunk 顺序(从 chunk[1] 开始): IHDR, PLTE, tRNS, IDAT
  每个 PNG chunk = 4字节内容长度(=data.length-4) + 4字节名称 + data(含尾部CRC4字节)
  PNG_END: 00 00 00 00 49 45 4E 44 AE 42 60 82

输出目录结构（tool/out/）：
  images/          res/images/ 下的 PNG（直接复制）
  icon.png         res/icon.png（直接复制）
  logo.png         res/logo.png（直接复制，如存在）
  role/            role 目录下的 Frame0 rpg → PNG
  ui/              ui.rpg 中的 Frame0 → PNG
  publicUI/        publicUI.rpg 中的 Frame0 → PNG
  skill/           skill.rpg 中的 Frame0 → PNG
  cartoon/         cartoon.rpg 中的 Frame0 → PNG
  petfight/        petfight 目录下的 Frame0 rpg → PNG
  map/             map 目录下的 rpg（Frame0→PNG，其余原样复制）
"""

import os
import shutil
import struct
import sys

# ---- 路径 ----
BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
RES_DIR  = os.path.join(BASE_DIR, "res")
OUT_DIR  = os.path.join(BASE_DIR, "tool", "out")

# PNG 常量
PNG_HEADER = bytes([0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A])
PNG_END    = bytes([0x00, 0x00, 0x00, 0x00, 0x49, 0x45, 0x4E, 0x44, 0xAE, 0x42, 0x60, 0x82])
# chunk 名称顺序：index 对应 chunks[index]（chunks[0] 是 aj 描述，不是 PNG chunk）
PNG_CHUNK_NAMES = ["sBIT", "IHDR", "PLTE", "tRNS", "IDAT"]  # 索引 0-4
# chunks[1]→IHDR, chunks[2]→PLTE, chunks[3]→tRNS, chunks[4+]→IDAT

SKIP_BYTES = "版权归苏龙德所有".encode("utf-8")   # 24 字节前缀


# ====================================================================
# 核心解析函数
# ====================================================================

def build_png_chunk(chunk_name: str, data_with_crc: bytes) -> bytes:
    """
    构建一个 PNG chunk。
    data_with_crc 的结构: [chunk内容][CRC(4字节)]
    content_len = len(data_with_crc) - 4
    输出: 4字节长度 + 4字节名称 + data_with_crc
    """
    content_len = len(data_with_crc) - 4
    return struct.pack(">I", content_len) + chunk_name.encode("ascii") + data_with_crc


def chunks_to_png(chunks: list) -> bytes | None:
    """
    将 rpg 帧的 chunks 列表重建为 PNG。
    chunks[0] = aj 描述（跳过，不是 PNG chunk）
    chunks[1] = IHDR 数据（含CRC）
    chunks[2] = PLTE 数据（含CRC，可为空）
    chunks[3] = tRNS 数据（含CRC，可为空）
    chunks[4+] = IDAT 数据（含CRC）
    """
    if not chunks or len(chunks) < 2:
        return None
    # chunks[1] 必须存在且 >4 字节（至少有 CRC）
    if not chunks[1] or len(chunks[1]) <= 4:
        return None

    out = bytearray(PNG_HEADER)
    # 从 chunks[1] 开始，对应 PNG chunk 名：IHDR, PLTE, tRNS, IDAT
    chunk_names = ["IHDR", "PLTE", "tRNS", "IDAT"]  # chunks[1..4] 对应
    for i in range(1, len(chunks)):
        chunk = chunks[i]
        if chunk and len(chunk) > 4:
            name_idx = i - 1  # chunks[1]→IHDR(0), chunks[2]→PLTE(1), chunks[3]→tRNS(2), chunks[4+]→IDAT(3)
            cname = chunk_names[name_idx] if name_idx < len(chunk_names) else "IDAT"
            out += build_png_chunk(cname, chunk)
    out += PNG_END
    return bytes(out)


def read_rpg_chunks(data: bytes) -> tuple[int, list] | None:
    """
    读取单独 rpg 文件的数据块。
    格式: short(id) + byte(0) + byte(nchunks) + [int size + data]*nchunks
    返回 (nchunks, [bytes, ...]) 或 None
    """
    if len(data) < 4:
        return None
    pos = 0
    pos += 2   # skip short id
    pos += 1   # skip byte (固定0)
    nchunks = data[pos]; pos += 1
    chunks = []
    for _ in range(nchunks):
        if pos + 4 > len(data):
            break
        size = struct.unpack_from(">I", data, pos)[0]; pos += 4
        chunk = data[pos:pos+size]; pos += size
        chunks.append(chunk)
    return nchunks, chunks


def parse_rule(rule_path: str) -> list:
    """
    解析 .rule 文件，返回 [(key:int, id:int), ...]
    格式: short count + [int key + short id] * count
    """
    entries = []
    with open(rule_path, "rb") as f:
        data = f.read()
    pos = 0
    count = struct.unpack_from(">H", data, pos)[0]; pos += 2
    for _ in range(count):
        if pos + 6 > len(data):
            break
        key  = struct.unpack_from(">I", data, pos)[0]; pos += 4
        rid  = struct.unpack_from(">H", data, pos)[0]; pos += 2
        entries.append((key, rid))
    return entries


def parse_pack_rpg(rpg_path: str, rule_count: int):
    """
    解析包 rpg 文件，按 rule_count 帧数逐帧读取。
    格式: SKIP(24) + [byte type + byte nchunks + [int size + data]*nchunks] * rule_count
    返回 list of (type:int, chunks:list)
    """
    with open(rpg_path, "rb") as f:
        data = f.read()

    pos = len(SKIP_BYTES)
    if pos > len(data):
        return []

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
            chunk = data[pos:pos+size]; pos += size
            chunks.append(chunk)
        frames.append((ftype, chunks))
    return frames


# ====================================================================
# 提取函数
# ====================================================================

def extract_images(out_base: str):
    """复制 res/images/ 下的 PNG 文件"""
    src = os.path.join(RES_DIR, "images")
    dst = os.path.join(out_base, "images")
    os.makedirs(dst, exist_ok=True)
    if not os.path.isdir(src):
        return
    count = 0
    for fname in os.listdir(src):
        if fname.lower().endswith(".png"):
            shutil.copy2(os.path.join(src, fname), os.path.join(dst, fname))
            count += 1
    print(f"  images: 复制 {count} 个 PNG")


def extract_root_pngs(out_base: str):
    """复制 res/ 根目录下的 PNG 文件（icon.png / logo.png 等）"""
    count = 0
    for fname in os.listdir(RES_DIR):
        if fname.lower().endswith(".png"):
            src = os.path.join(RES_DIR, fname)
            dst = os.path.join(out_base, fname)
            if os.path.isfile(src):
                shutil.copy2(src, dst)
                count += 1
    print(f"  根目录 PNG: 复制 {count} 个")


def extract_dir_rpg(src_dir: str, dst_dir: str, label: str):
    """
    提取目录下所有 Frame0 rpg 文件为 PNG（Frame1 记录为 JSON 元数据）。
    文件名为数字 id 的 rpg，按 nchunks 区分：
      nchunks >= 2 → Frame0 → 保存为 PNG
      nchunks == 1 → Frame1 → 跳过（动画引用帧）
    """
    os.makedirs(dst_dir, exist_ok=True)
    if not os.path.isdir(src_dir):
        print(f"  {label}: 目录不存在")
        return

    ok = 0
    skip_frame1 = 0
    fail = 0

    files = sorted(
        [f for f in os.listdir(src_dir) if f.endswith(".rpg")],
        key=lambda x: (int(x.split('.')[0]) if x.split('.')[0].lstrip('-').isdigit() else 0)
    )

    for fname in files:
        fpath = os.path.join(src_dir, fname)
        raw_id = fname[:-4]

        with open(fpath, "rb") as f:
            raw = f.read()

        result = read_rpg_chunks(raw)
        if result is None:
            fail += 1
            continue

        nchunks, chunks = result
        if nchunks < 2:
            # Frame1：动画帧，仅由 bx 引用组成，无 PNG 图像
            skip_frame1 += 1
            continue

        png_data = chunks_to_png(chunks)
        if png_data is None:
            fail += 1
            continue

        out_path = os.path.join(dst_dir, f"{raw_id}.png")
        with open(out_path, "wb") as f:
            f.write(png_data)
        ok += 1

    print(f"  {label}: Frame0(PNG)={ok}, Frame1(跳过)={skip_frame1}, 失败={fail}")


def extract_pack(rpg_path: str, rule_path: str, dst_dir: str, label: str):
    """
    提取包 rpg 文件中的所有 Frame0 为 PNG，按 rule 文件中的 id 命名。
    """
    if not os.path.isfile(rpg_path):
        print(f"  {label}: rpg 文件不存在 ({rpg_path})")
        return

    os.makedirs(dst_dir, exist_ok=True)

    # 解析 rule 文件获取帧顺序和 id
    rule_entries = []
    if rule_path and os.path.isfile(rule_path):
        rule_entries = parse_rule(rule_path)

    rule_count = len(rule_entries)
    if rule_count == 0:
        print(f"  {label}: rule 文件为空或不存在")
        return

    frames = parse_pack_rpg(rpg_path, rule_count)
    ok = 0
    skip_frame1 = 0
    fail = 0

    for i, (ftype, chunks) in enumerate(frames):
        if ftype != 0:
            # Frame1 动画帧，无直接 PNG
            skip_frame1 += 1
            continue

        png_data = chunks_to_png(chunks)
        if png_data is None:
            fail += 1
            continue

        # 命名：序号 + rule 中的 id
        if i < len(rule_entries):
            _, rid = rule_entries[i]
            name = f"{i:04d}_id{rid}"
        else:
            name = f"{i:04d}"

        out_path = os.path.join(dst_dir, f"{name}.png")
        with open(out_path, "wb") as f:
            f.write(png_data)
        ok += 1

    print(f"  {label}: Frame0(PNG)={ok}, Frame1(跳过)={skip_frame1}, 失败={fail}, 共={rule_count}帧")


def extract_map(out_base: str):
    """提取 res/map/ 目录，Frame0→PNG，其他原样复制"""
    src_dir = os.path.join(RES_DIR, "map")
    dst_dir = os.path.join(out_base, "map")
    os.makedirs(dst_dir, exist_ok=True)

    if not os.path.isdir(src_dir):
        print(f"  map: 目录不存在")
        return

    ok = 0
    skip_frame1 = 0
    copy_raw = 0
    fail = 0

    for fname in os.listdir(src_dir):
        if not fname.endswith(".rpg"):
            continue
        fpath = os.path.join(src_dir, fname)
        raw_id = fname[:-4]

        with open(fpath, "rb") as f:
            raw = f.read()

        result = read_rpg_chunks(raw)
        if result is None:
            # 无法按标准格式解析，原样复制
            shutil.copy2(fpath, os.path.join(dst_dir, fname))
            copy_raw += 1
            continue

        nchunks, chunks = result
        if nchunks < 2:
            skip_frame1 += 1
            continue

        png_data = chunks_to_png(chunks)
        if png_data is None:
            shutil.copy2(fpath, os.path.join(dst_dir, fname))
            copy_raw += 1
            continue

        with open(os.path.join(dst_dir, f"{raw_id}.png"), "wb") as f:
            f.write(png_data)
        ok += 1

    total = ok + skip_frame1 + copy_raw + fail
    print(f"  map: Frame0(PNG)={ok}, Frame1(跳过)={skip_frame1}, 原样复制={copy_raw}, 失败={fail} (共{total})")


# ====================================================================
# 主入口
# ====================================================================

def main():
    print(f"开始提取资源...")
    print(f"  RES_DIR: {RES_DIR}")
    print(f"  OUT_DIR: {OUT_DIR}")

    # 清空并重建输出目录
    if os.path.exists(OUT_DIR):
        shutil.rmtree(OUT_DIR)
    os.makedirs(OUT_DIR)

    print("\n[1] 提取根目录 PNG (icon.png / logo.png 等)")
    extract_root_pngs(OUT_DIR)

    print("\n[2] 提取 images/")
    extract_images(OUT_DIR)

    print("\n[3] 提取 role/*.rpg → role/")
    extract_dir_rpg(
        src_dir=os.path.join(RES_DIR, "role"),
        dst_dir=os.path.join(OUT_DIR, "role"),
        label="role"
    )

    print("\n[4] 提取 petfight/*.rpg → petfight/")
    extract_dir_rpg(
        src_dir=os.path.join(RES_DIR, "petfight"),
        dst_dir=os.path.join(OUT_DIR, "petfight"),
        label="petfight"
    )

    print("\n[5] 提取 ui.rpg → ui/")
    extract_pack(
        rpg_path=os.path.join(RES_DIR, "ui.rpg"),
        rule_path=os.path.join(RES_DIR, "ui.rule"),
        dst_dir=os.path.join(OUT_DIR, "ui"),
        label="ui"
    )

    print("\n[6] 提取 publicUI.rpg → publicUI/")
    extract_pack(
        rpg_path=os.path.join(RES_DIR, "publicUI.rpg"),
        rule_path=os.path.join(RES_DIR, "publicUI.rule"),
        dst_dir=os.path.join(OUT_DIR, "publicUI"),
        label="publicUI"
    )

    print("\n[7] 提取 skill.rpg → skill/")
    extract_pack(
        rpg_path=os.path.join(RES_DIR, "skill.rpg"),
        rule_path=os.path.join(RES_DIR, "skill.rule"),
        dst_dir=os.path.join(OUT_DIR, "skill"),
        label="skill"
    )

    print("\n[8] 提取 cartoon.rpg → cartoon/")
    extract_pack(
        rpg_path=os.path.join(RES_DIR, "cartoon.rpg"),
        rule_path=os.path.join(RES_DIR, "cartoon.rule"),
        dst_dir=os.path.join(OUT_DIR, "cartoon"),
        label="cartoon"
    )

    print("\n[9] 提取 map/*.rpg → map/")
    extract_map(OUT_DIR)

    # 汇总统计
    print("\n" + "=" * 50)
    total = 0
    for root, dirs, files in os.walk(OUT_DIR):
        total += len(files)
    print(f"提取完成！输出目录: {OUT_DIR}")
    print(f"共提取 {total} 个文件")

    # 按子目录统计
    for entry in sorted(os.listdir(OUT_DIR)):
        path = os.path.join(OUT_DIR, entry)
        if os.path.isdir(path):
            n = len(os.listdir(path))
            print(f"  {entry}/: {n} 个文件")
        else:
            print(f"  {entry}")


if __name__ == "__main__":
    main()
