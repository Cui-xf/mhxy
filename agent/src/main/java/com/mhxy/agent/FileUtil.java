package com.mhxy.agent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FileUtil {

    // 每个文件名对应一个独立队列
    private static final java.util.concurrent.ConcurrentHashMap<String, ConcurrentLinkedQueue<String>> QUEUES =
            new java.util.concurrent.ConcurrentHashMap<>();

    private static final ScheduledExecutorService FLUSHER = Executors.newSingleThreadScheduledExecutor(r -> {
        Thread t = new Thread(r, "fileutil-flusher");
        t.setDaemon(true);
        return t;
    });

    static {
        // 每 500ms 批量刷写一次
        FLUSHER.scheduleWithFixedDelay(FileUtil::flushAll, 500, 500, TimeUnit.MILLISECONDS);
        // JVM 退出时确保剩余内容落盘
        Runtime.getRuntime().addShutdownHook(new Thread(FileUtil::flushAll, "fileutil-shutdown"));
    }

    public static void write(String fileName, String content) {
        QUEUES.computeIfAbsent(fileName, k -> new ConcurrentLinkedQueue<>()).add(content);
    }

    private static void flushAll() {
        QUEUES.forEach((fileName, queue) -> {
            if (queue.isEmpty()) return;
            java.io.File file = new java.io.File(fileName);
            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                String line;
                while ((line = queue.poll()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.err.println("[FileUtil] 写入失败: " + fileName + " - " + e.getMessage());
            }
        });
    }
}
