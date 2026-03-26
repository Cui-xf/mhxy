package com.hook.agent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 从配置文件加载 hook 规则。
 *
 * 配置格式（每行一条规则）：
 *   com.example.Foo          → hook Foo 类所有方法
 *   com.example.Foo#bar      → 只 hook Foo 类的 bar 方法
 *   com.example.*            → hook com.example 包下所有类的所有方法
 *   com.example.**           → hook com.example 包及其子包下所有类的所有方法
 *   av                       → hook 默认包下 av 类所有方法
 *   av#a                     → hook av 类的 a 方法
 *
 * # 开头为注释，空行忽略
 */
public class HookConfig {

    private final List<Rule> rules = new ArrayList<>();
    private final Set<String> targetClassesCache = new HashSet<>();
    private final Set<String> targetPackagePrefixes = new HashSet<>();
    private boolean hasWildcardRules = false;

    public static HookConfig load(String filePath) {
        HookConfig config = new HookConfig();
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("[HookAgent] Config file not found: " + file.getAbsolutePath());
            return config;
        }

        System.out.println("[HookAgent] Loading config from: " + file.getAbsolutePath());
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNum = 0;
            while ((line = reader.readLine()) != null) {
                lineNum++;
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;

                Rule rule = parseRule(line);
                if (rule != null) {
                    config.rules.add(rule);
                    config.indexRule(rule);
                    System.out.println("[HookAgent]   Rule " + lineNum + ": " + rule);
                } else {
                    System.err.println("[HookAgent]   Invalid rule at line " + lineNum + ": " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("[HookAgent] Error reading config: " + e.getMessage());
        }

        System.out.println("[HookAgent] Loaded " + config.rules.size() + " rules");
        return config;
    }

    /**
     * 判断一个类是否可能需要被 hook（用于快速过滤，避免对每个类都做 ASM 解析）
     * @param internalClassName 内部格式，如 "com/yinhan/kjava/main/MainMidlet" 或 "av"
     */
    public boolean shouldTransformClass(String internalClassName) {
        String dotName = internalClassName.replace('/', '.');

        if (targetClassesCache.contains(dotName)) return true;

        for (String prefix : targetPackagePrefixes) {
            if (dotName.startsWith(prefix)) return true;
        }

        return false;
    }

    /**
     * 判断一个具体方法是否需要被 hook
     * @param internalClassName 内部格式
     * @param methodName 方法名
     */
    public boolean shouldHookMethod(String internalClassName, String methodName) {
        String dotName = internalClassName.replace('/', '.');
        for (Rule rule : rules) {
            if (rule.matchesMethod(dotName, methodName)) return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return rules.isEmpty();
    }

    // ========== 内部实现 ==========

    private void indexRule(Rule rule) {
        switch (rule.type) {
            case EXACT_CLASS:
            case EXACT_METHOD:
                targetClassesCache.add(rule.className);
                break;
            case PACKAGE_SINGLE:
            case PACKAGE_RECURSIVE:
                targetPackagePrefixes.add(rule.packagePrefix);
                hasWildcardRules = true;
                break;
        }
    }

    private static Rule parseRule(String line) {
        if (line.endsWith(".**")) {
            String pkg = line.substring(0, line.length() - 3);
            return new Rule(RuleType.PACKAGE_RECURSIVE, pkg + ".", null, null);
        }

        if (line.endsWith(".*")) {
            String pkg = line.substring(0, line.length() - 2);
            return new Rule(RuleType.PACKAGE_SINGLE, pkg + ".", null, null);
        }

        int hashIdx = line.indexOf('#');
        if (hashIdx > 0) {
            String className = line.substring(0, hashIdx);
            String methodName = line.substring(hashIdx + 1);
            if (methodName.isEmpty()) return null;
            return new Rule(RuleType.EXACT_METHOD, null, className, methodName);
        }

        return new Rule(RuleType.EXACT_CLASS, null, line, null);
    }

    private enum RuleType {
        EXACT_CLASS,
        EXACT_METHOD,
        PACKAGE_SINGLE,
        PACKAGE_RECURSIVE
    }

    private static class Rule {
        final RuleType type;
        final String packagePrefix;
        final String className;
        final String methodName;

        Rule(RuleType type, String packagePrefix, String className, String methodName) {
            this.type = type;
            this.packagePrefix = packagePrefix;
            this.className = className;
            this.methodName = methodName;
        }

        boolean matchesMethod(String dotClassName, String method) {
            switch (type) {
                case EXACT_CLASS:
                    return dotClassName.equals(className);
                case EXACT_METHOD:
                    return dotClassName.equals(className) && method.equals(methodName);
                case PACKAGE_SINGLE:
                    if (!dotClassName.startsWith(packagePrefix)) return false;
                    String remaining = dotClassName.substring(packagePrefix.length());
                    return !remaining.contains(".");
                case PACKAGE_RECURSIVE:
                    return dotClassName.startsWith(packagePrefix);
                default:
                    return false;
            }
        }

        @Override
        public String toString() {
            switch (type) {
                case EXACT_CLASS:    return className + "  (all methods)";
                case EXACT_METHOD:   return className + "#" + methodName;
                case PACKAGE_SINGLE: return packagePrefix + "*  (single level)";
                case PACKAGE_RECURSIVE: return packagePrefix + "**  (recursive)";
                default: return "?";
            }
        }
    }
}
