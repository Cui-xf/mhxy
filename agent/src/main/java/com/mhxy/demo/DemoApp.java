package com.mhxy.demo;

import java.util.Arrays;
import java.util.List;

/**
 * 演示应用：包含多种方法签名，用于验证 Java Agent hook 效果。
 * 运行方式：
 *   java -javaagent:target/agent-1.0-SNAPSHOT.jar \
 *        -cp target/agent-1.0-SNAPSHOT.jar \
 *        com.mhxy.agent.demo.DemoApp
 */
public class DemoApp {

    public static void main(String[] args) {
        DemoApp app = new DemoApp();

        System.out.println("=== 开始调用演示方法 ===");

        // 基本类型参数
        int sum = app.add(3, 5);
        System.out.println("add(3,5) = " + sum);

        // String 参数
        String greeting = app.greet("World");
        System.out.println("greet = " + greeting);

        // 静态方法
        String upper = toUpperCase("hello");
        System.out.println("toUpperCase = " + upper);

        // 数组参数
        double avg = app.average(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        System.out.println("average = " + avg);

        // 多返回类型
        List<String> items = app.buildList("a", "b", "c");
        System.out.println("buildList = " + items);

        // 异常声明方法
        try {
            app.riskyOperation(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("caught: " + e.getMessage());
        }



        System.out.println("=== 演示结束 ===");
    }

    public int add(int a, int b) {
        return a + b;
    }

    private String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static String toUpperCase(String input) {
        return input == null ? null : input.toUpperCase();
    }

    public double average(double[] numbers) {
        if (numbers == null || numbers.length == 0) return 0.0;
        double sum = 0;
        for (double n : numbers) sum += n;
        return sum / numbers.length;
    }

    public List<String> buildList(String... elements) {
        return Arrays.asList(elements);
    }

    public void riskyOperation(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("value must be non-negative, got: " + value);
        }
    }

    protected boolean isEven(int n) {
        return n % 2 == 0;
    }
}
