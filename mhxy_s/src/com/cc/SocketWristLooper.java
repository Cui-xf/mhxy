package com.cc;

/**
 * 发包驱动线程：每 15ms 调用一次 SocketReadLooper.write()，
 * 将主线程放入 packetQueue/heartbeatQueue 的数据包依次写入 Socket。
 */
final class SocketWristLooper implements Runnable {
    private boolean starting;
    private final NetUtils netUtils;

    public SocketWristLooper(NetUtils netUtils) {
        this.netUtils = netUtils;
        this.starting = true;
        new Thread(this).start();
    }

    public void stop() {
        this.starting = false;
    }

    public void run() {
        for (; this.starting; NetUtils.sleep(15)) {
            if (this.netUtils.socketReadLooper != null) {
                this.netUtils.socketReadLooper.write();
            }
        }

    }
}
