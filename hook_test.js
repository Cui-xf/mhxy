if (Java.available) {
    console.log("成功识别 JVM！");
    Java.perform(function() {
        console.log("Java 环境已就绪");
        // 这里写你的 Hook 代码
    });
} else {
    console.log("Java 环境不可用，请检查 JVM 是否带有符号表或版本是否兼容。");
}
