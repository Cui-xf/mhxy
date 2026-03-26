package com.mhxy.agent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PackageFilter {

    private static volatile List<Pattern> packagePatterns = new ArrayList<>();
    private static volatile List<Pattern> methodPatterns = new ArrayList<>();

    public static void load(String configPath) {
        try {
            Files.readAllLines(Paths.get(configPath))
                    .stream()
                    .map(String::trim)
                    .filter(l -> !l.isEmpty() && !l.startsWith("#"))
                    .forEach(s -> {
                        String[] split = s.split("@");
                        Pattern compile1 = Pattern.compile(split[0].trim());
                        packagePatterns.add(compile1);
                        Pattern compile2 = Pattern.compile(split[1].trim());
                        methodPatterns.add(compile2);
                    });
            System.out.println("[MethodSignatureAgent] 过滤package:" + packagePatterns.stream().map(Pattern::pattern).collect(Collectors.toList()));
            System.out.println("[MethodSignatureAgent] 过滤method:" + methodPatterns.stream().map(Pattern::pattern).collect(Collectors.toList()));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回 true 表示该类名命中了过滤器（应打印）
     */
    public static boolean matchesPackage(String name) {
        for (Pattern pattern : packagePatterns) {
            if (pattern.matcher(name).find()) {
                System.out.println("[AGENT]命中类" + name);
                return true;
            }
        }
        return false;
    }

    public static boolean matchesMethod(String name) {
        for (Pattern pattern : methodPatterns) {
            if (pattern.matcher(name).find()) {
                return true;
            }
        }
        return false;
    }
}
