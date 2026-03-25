// 梦回西游 网络数据抓包脚本
// 协议结构:
//   at 类: Socket 连接管理，负责发送
//   av 类: 接收数据包解析（支持 gzip 解压）
//   w  类: 数据包对象，d=cmdId, b=payload

Java.perform(function () {

    // ========== 工具函数 ==========

    function bytesToHex(bytes) {
        if (!bytes) return "(null)";
        var hex = "";
        for (var i = 0; i < Math.min(bytes.length, 256); i++) {
            var b = bytes[i] & 0xFF;
            hex += ("0" + b.toString(16)).slice(-2) + " ";
            if ((i + 1) % 16 === 0) hex += "\n         ";
        }
        if (bytes.length > 256) hex += "... (" + bytes.length + " bytes total)";
        return hex;
    }

    function bytesToStr(bytes) {
        if (!bytes) return "(null)";
        try {
            var str = "";
            for (var i = 0; i < Math.min(bytes.length, 200); i++) {
                var c = bytes[i] & 0xFF;
                str += (c >= 32 && c < 127) ? String.fromCharCode(c) : ".";
            }
            return str;
        } catch(e) { return "(error)"; }
    }

    function formatCmd(cmd) {
        return "0x" + cmd.toString(16).toUpperCase() + " (" + cmd + ")";
    }

    // ========== Hook w 类：数据包构造 ==========
    // 用于追踪发出的包（在 sendPacket 之前）
    var w = Java.use("w");
    w.$init.overload('short', '[B').implementation = function(cmd, payload) {
        this.$init(cmd, payload);
        console.log("\n[PACKET CREATED] cmd=" + formatCmd(cmd & 0xFFFF) +
                    " payloadLen=" + (payload ? payload.length : 0));
        if (payload && payload.length > 0) {
            console.log("  hex: " + bytesToHex(payload));
        }
        return;
    };

    // ========== Hook av.a(w) 发送数据包 ==========
    var av = Java.use("av");
    av.a.overload('w').implementation = function(pkt) {
        var cmd = pkt.a() & 0xFFFF;
        var payload = pkt.b.value;
        console.log("\n╔═══ [SEND] cmd=" + formatCmd(cmd));
        if (payload && payload.length > 0) {
            console.log("║  len=" + payload.length);
            console.log("║  hex: " + bytesToHex(payload));
            console.log("║  str: " + bytesToStr(payload));
        }
        console.log("╚═══");
        return this.a(pkt);
    };

    // ========== Hook av.b(w) 接收数据包入队 ==========
    // 这是解析完成后放入队列的方法
    av.b.overload('w').implementation = function(pkt) {
        var cmd = pkt.a() & 0xFFFF;
        var payload = pkt.b.value;
        console.log("\n╔═══ [RECV] cmd=" + formatCmd(cmd));
        if (payload && payload.length > 0) {
            console.log("║  len=" + payload.length);
            console.log("║  hex: " + bytesToHex(payload));
            console.log("║  str: " + bytesToStr(payload));
        }
        console.log("╚═══");
        return this.b(pkt);
    };

    // ========== Hook at.b() 实际 Socket 发送 ==========
    var at = Java.use("at");
    at.b.overload().implementation = function() {
        return this.b();
    };

    // ========== Hook Socket 连接地址 ==========
    // av.a(String) 是检查地址是否变更的静态方法
    // av.b() 是初始化连接
    // 打印当前连接地址
    try {
        var avClass = Java.use("av");
        console.log("\n[INFO] 服务器地址:");
        console.log("  Socket: " + avClass.b.value);
        console.log("  HTTP:   " + avClass.a.value);
    } catch(e) {
        console.log("[INFO] 读取地址失败: " + e);
    }

    // ========== Hook DataOutputStream.write 底层字节流 ==========
    // 如果上层 hook 不够，这里抓原始发送字节
    var DataOutputStream = Java.use("java.io.DataOutputStream");
    DataOutputStream.write.overload('[B').implementation = function(buf) {
        // 过滤掉太小的包（心跳等）
        if (buf && buf.length > 4) {
            console.log("\n[RAW SEND] len=" + buf.length + "\n  " + bytesToHex(buf));
        }
        return this.write(buf);
    };

    // ========== Hook DataInputStream.readFully 底层字节流 ==========
    var DataInputStream = Java.use("java.io.DataInputStream");
    DataInputStream.readFully.overload('[B').implementation = function(buf) {
        this.readFully(buf);
        if (buf && buf.length > 4) {
            console.log("\n[RAW RECV] len=" + buf.length + "\n  " + bytesToHex(buf));
        }
        return;
    };

    console.log("\n[*] 网络 Hook 已加载，等待数据...\n");
});
