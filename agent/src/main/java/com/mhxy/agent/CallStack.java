package com.mhxy.agent;

import java.util.ArrayDeque;
import java.util.Deque;

public class CallStack {

    private static final ThreadLocal<Deque<String>> STACK =
            ThreadLocal.withInitial(ArrayDeque::new);

    /**
     * 进入方法：压入调用签名，返回当前深度（压入前的深度，即缩进层数）
     */
    public static void push(String callLine) {
        Deque<String> stack = STACK.get();
        int depth = stack.size();
        // 按深度缩进打印入口行
        System.out.println(indent(depth) + callLine);
        stack.push(callLine);
    }

    /**
     * 退出方法：弹出栈帧，按深度缩进打印出口行
     */
    public static void pop(String returnLine) {
        Deque<String> stack = STACK.get();
        if (!stack.isEmpty()) {
            stack.pop();
        }
        int depth = stack.size();
        System.out.println(indent(depth) + returnLine);
    }

    private static String indent(int depth) {
        if (depth <= 0) return "";
        StringBuilder sb = new StringBuilder(depth);
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
