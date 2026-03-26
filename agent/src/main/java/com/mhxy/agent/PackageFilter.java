package com.mhxy.agent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PackageFilter {

    private static volatile List<Pattern> patterns = Collections.emptyList();

    public static void load(String configPath) {
        try {
            List<Pattern> loaded = Files.readAllLines(Paths.get(configPath))
                    .stream()
                    .map(String::trim)
                    .filter(l -> !l.isEmpty() && !l.startsWith("#"))
                    .map(Pattern::compile)
                    .collect(Collectors.toList());
            patterns = loaded;
            System.out.println("[MethodSignatureAgent] Package filter loaded " + loaded.size()
                    + " patterns from " + configPath + ": "
                    + loaded.stream().map(Pattern::pattern).collect(Collectors.toList()));
        } catch (IOException e) {
            System.err.println("[MethodSignatureAgent] Failed to load package filter config: "
                    + configPath + " (" + e.getMessage() + "), all packages will be printed.");
        }
    }

    /**
     * 返回 true 表示该类名命中了过滤器（应打印）
     */
    public static boolean matches(String className) {
        List<Pattern> p = patterns;
        if (p.isEmpty()) {
            return true;
        }
        for (Pattern pattern : p) {
            if (pattern.matcher(className).find()) {
                return true;
            }
        }
        return false;
    }
}
