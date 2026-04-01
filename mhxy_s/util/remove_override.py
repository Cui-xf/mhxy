"""
删除 Java 代码中所有的 @Override 注解（仅删除字符，不删除整行）
"""

import sys
from pathlib import Path


def fix_file(path: Path) -> bool:
    original = path.read_text(encoding='utf-8')
    fixed = original.replace('@Override', '')
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
