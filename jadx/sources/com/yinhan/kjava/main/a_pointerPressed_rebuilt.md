# `a.java` `pointerPressed(int, int)` 梳理稿

说明：
- 这是根据 `jadx/sources/com/yinhan/kjava/main/a.java` 与对照版本 `mhxy_s/src/com/yinhan/kjava/main/MainCanvas.java` 交叉整理出的可读版。
- 目标是还原控制流，方便继续人工分析；不是直接可编译回填版本。
- 明显的反编译问题主要有 3 处：
  - `case 5`：命中角色格子后的结果被循环后面的默认值错误覆盖。
  - `case 6`：命中按钮后的结果同样被默认值覆盖，而且最后两个按钮本应是确认动作，不是左右切换。
  - `case 14`：`while (true)` 缺了跳出逻辑，实际应当是“遍历菜单项，命中则确认，否则再判断右下角退出按钮”。

```java
protected final void pointerPressed(int x, int y) {
    if (!t.o || this.aj == null) {
        return;
    }

    this.aj.e = x;
    this.aj.f = y;
    this.aA = 0;
    this.aj.a(this.aj.e, this.aj.f);

    f touch = this.aj;
    int px = this.aj.e;
    int py = this.aj.f;

    switch (touch.b.j) {
        case 2:
            touch.b.a = touch.b.a(px, py);
            return;

        case 4:
            if (touch.b.c == 0) {
                if (touch.b.aq != null) {
                    touch.b.a = touch.b.aq.b(px, py);
                }
                return;
            }

            if (touch.b.c == 2) {
                touch.b.a = touch.b.a(px, py);
            }
            return;

        case 5:
            if (touch.b.aq != null) {
                touch.b.a = touch.b.aq.b(px, py);
                int action = touch.b.a;

                if (touch.b.bC != null) {
                    for (int index = 0; index < touch.b.bC.length; index++) {
                        int[] rect = touch.b.bC[index];
                        boolean hit =
                                px >= rect[0] && px <= rect[0] + rect[2] &&
                                py >= rect[1] && py <= rect[1] + rect[3];

                        if (!hit) {
                            continue;
                        }

                        byte col = (byte) (index % 2);
                        byte row = (byte) (index / 2);

                        if (col == touch.b.bz && row == touch.b.bA) {
                            action = 1073741824;
                        } else {
                            touch.b.bz = col;
                            touch.b.bA = (byte) (row == 0 ? 1 : 0);
                            action = 4;
                        }
                        break;
                    }
                }

                touch.b.a = action;
            }

            if (touch.b.c == 1) {
                touch.b.a = ca.c(px, py);
                return;
            }

            if (touch.b.c == 2) {
                break;
            }
            return;

        case 6:
            if (touch.b.aq != null) {
                touch.b.a = touch.b.aq.b(px, py);
                int action = touch.b.a;

                if (touch.b.bC != null) {
                    for (int index = 0; index < touch.b.bC.length; index++) {
                        int[] rect = touch.b.bC[index];
                        boolean hit =
                                px >= rect[0] && px <= rect[0] + rect[2] &&
                                py >= rect[1] && py <= rect[1] + rect[3];

                        if (!hit) {
                            continue;
                        }

                        if (index < 2) {
                            touch.b.bH = 0;
                            action = (index % 2 == 0) ? 8 : 2;
                        } else if (index < 4) {
                            touch.b.bH = 1;
                            action = (index % 2 == 0) ? 8 : 2;
                        } else {
                            touch.b.bH = 2;
                            touch.b.bG = index % 2;
                            action = 1073741824;
                        }
                        break;
                    }
                }

                touch.b.a = action;
                return;
            }
            return;

        case 10:
            if (touch.b.aq != null) {
                touch.b.a = touch.b.aq.b(px, py);
            }
            return;

        case 14:
            if (touch.b.c != 0) {
                touch.b.a = ca.b(px, py);
                return;
            }

            int action = 0;
            for (int index = 0; index < touch.b.bo.length; index++) {
                int left = (t.b - touch.b.bi.getWidth()) >> 1;
                int right = left + touch.b.bi.getWidth();
                int top = (touch.b.bt << 1) + touch.b.bh.getHeight() + (touch.b.bi.getHeight() * index);
                int bottom = (touch.b.bt << 1) + touch.b.bh.getHeight() + (touch.b.bi.getHeight() * (index + 1));

                if (px > left && px < right && py > top && py < bottom) {
                    touch.b.bs = index;
                    touch.b.al = 0L;
                    action = 1073741824;
                    break;
                }
            }

            if (action == 0 && t.a == 1) {
                int left = (t.b - t.i.stringWidth("退出")) - 4;
                int right = t.b - 4;
                int top = (t.c - t.j) - 4;
                int bottom = t.c - 4;

                if (px >= left && px <= right && py >= top && py <= bottom) {
                    action = 536870912;
                }
            }

            touch.b.a = action;
            return;

        case 15:
        case 16:
        case 17:
            touch.b.a = ca.b(px, py);
            return;

        case 18:
        case 19:
            touch.b.a = ca.a(px, py);
            return;

        case 20:
            break;

        case 3:
        case 7:
        case 8:
        case 9:
        case 11:
        case 12:
        case 13:
        default:
            return;
    }

    touch.b.a = ca.b(px, py);
}
```

补充判断：
- `1073741824` 在这里基本就是“确认/选中当前项”。
- `536870912` 对应标题界面右下角的“退出”软键区域。
- `case 5` 是角色列表点击逻辑。
- `case 6` 是创建角色界面点击逻辑，`bH` 表示当前焦点组，`bG` 表示最后一组里的左右选项。
