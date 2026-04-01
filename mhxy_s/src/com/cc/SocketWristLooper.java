package com.cc;

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
