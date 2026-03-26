package com.mhxy.agent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PackageFilter {

    private static volatile List<Pattern> patterns = new ArrayList<>();
    private static volatile List<Pattern> excludePatterns = new ArrayList<>();

    public static void load(String configPath) {
        try {
            Files.readAllLines(Paths.get(configPath))
                    .stream()
                    .map(String::trim)
                    .filter(l -> !l.isEmpty() && !l.startsWith("#"))
                    .forEach(s -> {
                        if (s.startsWith("[NOT]")) {
                            Pattern compile = Pattern.compile(s.substring("[NOT]".length()));
                            excludePatterns.add(compile);
                        } else {
                            Pattern compile = Pattern.compile(s);
                            patterns.add(compile);
                        }
                    });
            System.out.println("[MethodSignatureAgent] 命中过滤:" + patterns.size() + ": "
                    + patterns.stream().map(Pattern::pattern).collect(Collectors.toList()));
            System.out.println("[MethodSignatureAgent] 排除过滤:" + excludePatterns.size() + ": "
                    + excludePatterns.stream().map(Pattern::pattern).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回 true 表示该类名命中了过滤器（应打印）
     */
    public static boolean matches(String name) {
        for (Pattern excludePattern : excludePatterns) {
            if (excludePattern.matcher(name).find()) {
                return false;
            }
        }

        List<Pattern> p = patterns;
        if (p.isEmpty()) {
            return true;
        }
        for (Pattern pattern : p) {
            if (pattern.matcher(name).find()) {
                return true;
            }
        }
        return false;
    }
}
