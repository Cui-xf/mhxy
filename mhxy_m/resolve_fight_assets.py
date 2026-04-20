"""
战斗/场景资源还原脚本
将 hashKey 命名的资源文件重命名为可读的原始名称。

hashKey 算法（与 HashKey.kt 一致）：
  pic  → name + "p"
  anim → name + "s"
  hash = 0; for c in name: hash = hash * 31 + ord(c)  → signed int32

── role 动画命名规则汇总 ──────────────────────────────────────────
1. 战斗动画（FightRoleData.b()）：
     f{外观ID}0{dir}{action}
     dir=0/1，action=1(待机)/2(攻击)，死亡: f{id}04

2. 场景移动/攻击动画（buildRoleResStr，无坐骑）：
     {jobChar}{genderChar}{appearance}{dirChar}[4]
     jobChar:    roleJobResIds[job]      = ['1','2','3']
     genderChar: roleGenderResIds[gender]= ['0','1']
     dirChar:    roleDirectionResId[dir] = ['0','0','1','1','4']
     末尾 '4' 表示攻击动画，无则为移动动画

3. 坐骑动画（buildRoleResStr，有坐骑）：
     {rideIcon}{jobChar}{genderChar}{appearance}{dirChar}[4]
     rideIcon 为服务器下发的字符串，无法静态枚举
     → 剩余未识别文件保留 hash 并加 ride_ 前缀：ride_{index}_{hash}.anim
"""

import os
import ctypes

ASSET_ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)),
                          "src/main/resources/assets")


def hash_key(name: str, ext: str) -> int:
    suffix = {"pic": "p", "anim": "s", "tmap": "m"}[ext]
    full = name + suffix
    h = 0
    for c in full:
        h = h * 31 + ord(c)
    return ctypes.c_int32(h).value


def build_hash_index(directory: str, ext: str) -> dict:
    """扫描目录，构建 {hashValue: filepath} 索引。"""
    index = {}
    dir_path = os.path.join(ASSET_ROOT, directory)
    if not os.path.isdir(dir_path):
        return index
    for fname in os.listdir(dir_path):
        base, fext = os.path.splitext(fname)
        if fext.lstrip(".") != ext:
            continue
        for part in base.split("_"):
            try:
                index[int(part)] = os.path.join(dir_path, fname)
            except ValueError:
                pass
    return index


def rename_all(directory: str, ext: str, candidates: list[str]) -> tuple[list, list]:
    """
    对 candidates 中的每个 name，查找对应 hash 文件并重命名。
    返回 (found_list, missing_list)
    """
    index = build_hash_index(directory, ext)
    found, missing = [], []

    for name in candidates:
        dst_path = os.path.join(ASSET_ROOT, directory, f"{name}.{ext}")
        # 已经是可读名，跳过
        if os.path.exists(dst_path):
            found.append(name)
            continue
        key = hash_key(name, ext)
        src_path = index.get(key)
        if src_path:
            os.rename(src_path, dst_path)
            # 更新索引，避免同一文件被重复匹配
            del index[key]
            print(f"  {os.path.basename(src_path):40s} -> {name}.{ext}")
            found.append(name)
        else:
            missing.append(name)

    return found, missing


def rename_unknown_as_ride(directory: str, ext: str) -> list[str]:
    """
    对目录中仍以 '{index}_{hash}.ext' 格式命名的文件（无法识别原始名），
    重命名为 ride_{index}_{hash}.ext，保留原始 hash 以便将来反查。
    这些文件对应有坐骑时的场景动画（rideIcon 由服务器下发，无法静态枚举）。
    返回已重命名的文件列表。
    """
    dir_path = os.path.join(ASSET_ROOT, directory)
    renamed = []
    for fname in sorted(os.listdir(dir_path)):
        base, fext = os.path.splitext(fname)
        if fext.lstrip(".") != ext:
            continue
        # 仍是原始 hash 格式：{index}_{hash}（不以 ride_ 开头）
        parts = base.split("_")
        if len(parts) < 2 or base.startswith("ride_"):
            continue
        try:
            index_num = int(parts[0])
            int(parts[1])  # 确认第二部分也是整数（hash）
        except ValueError:
            continue
        new_name = f"ride_{index_num}_{parts[1]}.{ext}"
        dst_path = os.path.join(dir_path, new_name)
        if os.path.exists(dst_path):
            continue
        os.rename(os.path.join(dir_path, fname), dst_path)
        print(f"  {fname:45s} -> {new_name}")
        renamed.append(new_name)
    return renamed


# ── role 候选名称生成 ─────────────────────────────────────────────────────────

# 规则1：f{appearId}{mid}{dir_char}{action}
#   appearId: 外观ID（short this.i），战斗中取值 10,11,20,21,30,31
#             = roleJobResIds[job] + roleGenderResIds[gender] 拼成的两位字符串
#   mid:      固定 '0'（战斗侧面）或 '1'（正面/选角，另一套加载逻辑）
#   dir_char: 方向（this.t），有效值 '0'/'1'/'4'
#   action:   1(待机)/2(攻击)，死亡特殊: f{appearId}0{action=4}（无 dir_char）
role_candidates = []
# appearId = job(1/2/3) × gender(0/1) 的两位组合
for job in ['1', '2', '3']:
    for gender in ['0', '1']:
        appear = job + gender
        for mid in ['0', '1']:
            for dir_c in ['0', '1', '4']:
                for action in ['1', '2']:
                    role_candidates.append(f"f{appear}{mid}{dir_c}{action}")
            role_candidates.append(f"f{appear}{mid}4")  # 死亡

# 规则2：场景移动/攻击动画（无坐骑）{job}{gender}{appearance}{dir}[4]
# roleJobResIds=['1','2','3'], roleGenderResIds=['0','1']
# roleDirectionResId=['0','0','1','1','4'] → 有效输出字符为 '0','1','4'
for j in ['1', '2', '3']:
    for g in ['0', '1']:
        for ap in range(51):          # appearance 0..50（时装ID）
            for d in ['0', '1', '4']:
                role_candidates.append(f"{j}{g}{ap}{d}")    # 移动
                role_candidates.append(f"{j}{g}{ap}{d}4")   # 攻击

# ── petfight 候选名称生成 ──────────────────────────────────────────────────────
# 规则：{id}{action}，action=1(待机)/2(攻击)/3(受击)

pet_candidates = []
for pid in range(1, 300):
    for action in [1, 2, 3]:
        pet_candidates.append(f"{pid}{action}")


# ── 执行 ──────────────────────────────────────────────────────────────────────

print("=" * 60)
print("== rpg/role (anim) — 战斗动画 + 场景移动/攻击动画 ==")
found_r, miss_r = rename_all("rpg/role", "anim", role_candidates)
print(f"   命中 {len(found_r)} 个，缺失 {len(miss_r)} 个")

print()
print("== rpg/role (anim) — 剩余坐骑动画按索引编号 ==")
ride_renamed = rename_unknown_as_ride("rpg/role", "anim")
print(f"   坐骑动画重命名 {len(ride_renamed)} 个")

print()
print("== rpg/petfight (anim) ==")
found_p, miss_p = rename_all("rpg/petfight", "anim", pet_candidates)
print(f"   命中 {len(found_p)} 个，缺失 {len(miss_p)} 个")

print()
print("== 完成 ==")
print(f"role  战斗动画已还原: {sorted(n for n in found_r if n.startswith('f'))}")
print(f"role  场景动画已还原: {sorted(n for n in found_r if not n.startswith('f'))}")
print(f"role  坐骑动画已编号: {sorted(ride_renamed)}")
print(f"pet   已还原: {sorted(found_p)}")
