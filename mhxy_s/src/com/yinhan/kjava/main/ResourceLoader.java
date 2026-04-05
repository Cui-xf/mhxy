package com.yinhan.kjava.main;

/**
 * 游戏资源加载后台线程。
 * <p>
 * 在 Logo 动画播放完毕后（touchPageCase 9 → 0）由主线程创建并启动。
 * 与主线程并发执行：主线程继续渲染加载进度页（case 0），本线程在后台加载资源。
 * <p>
 * a != aB 时（正常启动路径）：调用 MainCanvas.c() 加载全部游戏图片资源，完成后跳转登录页。
 * a == aB 时（特殊路径）：等待主线程处理完网络响应（touchPageCase 离开 1 且 p=false）后退出。
 */
final class ResourceLoader implements Runnable {
    private final MainCanvas mainCanvas;

    public ResourceLoader(MainCanvas mainCanvas) {
        this.mainCanvas = mainCanvas;
        new Thread(this).start();
    }

    public void run() {
        // 正常启动：加载游戏图片资源（UI、角色、道具等），完成后进入登录流程
        MainCanvas.loadResource(this.mainCanvas);
    }
}
