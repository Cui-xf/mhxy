"""
修复 Java 代码中的 Array.newInstance 写法，例如：
  (int[][])   Array.newInstance((Class<?>) Integer.TYPE, m, n)   -> new int[m][n]
  (short[][]) Array.newInstance((Class<?>) Short.TYPE,   m, n)   -> new short[m][n]
"""

import re
import sys
from pathlib import Path


# 匹配形如 expr() 或 expr.field 或纯数字/变量名 的参数
_ARG = r'[\w.]+(?:\(\))?'

PATTERNS = [
    (
        re.compile(
            rf'\(int\[\]\[\]\)\s*Array\.newInstance\(\(Class<\?>\)\s*Integer\.TYPE,\s*({_ARG}),\s*({_ARG})\)'
        ),
        'int',
    ),
    (
        re.compile(
            rf'\(short\[\]\[\]\)\s*Array\.newInstance\(\(Class<\?>\)\s*Short\.TYPE,\s*({_ARG}),\s*({_ARG})\)'
        ),
        'short',
    ),
]


def fix_file(path: Path) -> bool:
    original = path.read_text(encoding='utf-8')
    fixed = original
    for pattern, java_type in PATTERNS:
        fixed = pattern.sub(lambda m, t=java_type: f'new {t}[{m.group(1)}][{m.group(2)}]', fixed)
    if fixed != original:
        path.write_text(fixed, encoding='utf-8')
        return True
    return False


def scan_dir(root: Path):
    java_files = list(root.rglob('*.java'))
    if not java_files:
        print(f'未找到任何 .java 文件: {root}')
        return

    changed = 0
    for f in java_files:
        if fix_file(f):
            print(f'[已修复] {f}')
            changed += 1

    print(f'\n共扫描 {len(java_files)} 个文件，修复 {changed} 个。')


if __name__ == '__main__':
    root = Path(sys.argv[1]) if len(sys.argv) > 1 else Path('.')
    if not root.is_dir():
        print(f'路径不存在或不是目录: {root}')
        sys.exit(1)
    scan_dir(root)
