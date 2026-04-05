package com.cc;

import javax.microedition.lcdui.Canvas;
import java.util.HashMap;
import java.util.Map;

public class InputAction {
    // ---- 方向键 ----
    // 上
    public static final int UP = 1;
    // 右
    public static final int RIGHT = 2;
    // 下
    public static final int DOWN = 4;
    // 左
    public static final int LEFT = 8;

    // ---- 数字键 (512 | 键序号, 1-based) ----
    public static final int NUM_1 = 513;
    public static final int NUM_2 = 514;
    public static final int NUM_3 = 515;
    public static final int NUM_4 = 516;
    public static final int NUM_5 = 517;
    public static final int NUM_6 = 518;
    public static final int NUM_7 = 519;
    public static final int NUM_8 = 520;
    public static final int NUM_9 = 521;

    // ---- 其他键码 ----
    // 键码 48（0 键等）
    public static final int KEY_48 = 48;
    // 键码 50（2 键等）
    public static final int KEY_50 = 50;
    // 左软键 * 号?
    public static final int SOFT_LEFT = 1024;
    // 右软键 # 号
    public static final int SOFT_RIGHT = 2048;

    // ---- 特殊动作键 ----
    // 手机实体确认键原始 keyCode（-21/-6），语义等同于 CONFIRM（1<<28）
    public static final int CONFIRM_KEY = 268435456;
    // 退出（1<<29）
    public static final int QUIT = 536870912;
    // MIDP GameAction FIRE，语义等同于 CONFIRM_KEY（1<<30）
    public static final int CONFIRM = 1073741824;

    //<code,action>
    private static final Map KEY_MAP = new HashMap();

    static {
        register(-22, InputAction.QUIT);
        register(-11, InputAction.QUIT);
        register(-7, InputAction.QUIT);
        register(-21, InputAction.CONFIRM_KEY);
        register(-6, InputAction.CONFIRM_KEY);
        register(35, InputAction.SOFT_RIGHT);
        register(42, InputAction.SOFT_LEFT);
        register(48, InputAction.KEY_48);

        register(49, InputAction.NUM_1);
        register(50, InputAction.NUM_2);
        register(51, InputAction.NUM_3);
        register(52, InputAction.NUM_4);
        register(53, InputAction.NUM_5);
        register(54, InputAction.NUM_6);
        register(55, InputAction.NUM_7);
        register(56, InputAction.NUM_8);
        register(57, InputAction.NUM_9);

        register(1, InputAction.UP);
        register(2, InputAction.LEFT);
        register(5, InputAction.RIGHT);
        register(6, InputAction.DOWN);
        register(8, InputAction.CONFIRM);
    }

    private static void register(int code, int action) {
        KEY_MAP.put(new Integer(code), new Integer(action));
    }


    public static int parseAction(Canvas canvas, int code) {
        Integer c = new Integer(code);
        if (KEY_MAP.containsKey(c)) {
            return ((Integer) KEY_MAP.get(c)).intValue();
        } else {
            c = new Integer(canvas.getGameAction(code));
            if (KEY_MAP.containsKey(c)) {
                return ((Integer) KEY_MAP.get(c)).intValue();
            } else {
                return 0;
            }
        }
    }
}
