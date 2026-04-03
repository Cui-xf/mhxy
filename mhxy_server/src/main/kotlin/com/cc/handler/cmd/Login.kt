package com.cc.handler.cmd

import com.cc.handler.util.ResponseWriter
import io.netty.channel.ChannelHandlerContext
import java.io.DataInputStream
import java.util.UUID

/**
 * 握手/建连包 opcode=6400 (0x1900)
 *
 * 业务字段（NetPayloadBuilder#login，头尾已由 CmdRegistry 剥离）：
 * [loginType: byte] [deviceId1: int] [deviceId2: int]
 * [channel: UTF] [version: UTF] [-1: int] [r: byte] [s: byte] [u: byte]
 * [memorySize: int] [var1: byte] [zhanghaoPwd: UTF]
 */
object HandshakeHandler : CmdHandler {
    override val cmd = 6400

    override fun handle(ctx: ChannelHandlerContext, dis: DataInputStream) {
        val loginType = dis.readByte()
        val deviceId1 = dis.readInt()
        val deviceId2 = dis.readInt()
        val channel = dis.readUTF()
        val version = dis.readUTF()
        dis.readInt()                  // -1 固定值
        val r = dis.readByte()         // 渠道子类型
        val s = dis.readByte()         // 服务器编号
        val u = dis.readByte()
        val memorySize = dis.readInt()
        val var1 = dis.readByte()
        val zhanghaoPwd = dis.readUTF()

        // zhanghaoPwd 格式：loginType:account:password
        val parts = zhanghaoPwd.split(":")
        val account = if (parts.size >= 2) parts[1] else zhanghaoPwd
        val token = UUID.randomUUID().toString().replace("-", "")

        println(
            "[Handshake] channel=$channel version=$version " +
                    "server=$s loginType=$loginType deviceId=${deviceId1}:${deviceId2} " +
                    "memory=${memorySize / 1024}KB account=$account"
        )

        // opcode=8194：下发账号/token（来源：NetworkPacketProcessors.java case 8194）
        // body: [account: UTF][token: UTF]
        // 客户端收到后写入 GlobalStatus.b(account) / GlobalStatus.d(token)
        val body8194 = ResponseWriter.buildBody {
            writeUTF(account)
            writeUTF(token)
        }
        ResponseWriter.send(ctx, 8194, body8194)

        // opcode=8195：下发角色列表（来源：GlobalStatus.a(DataInputStream) + 真包日志）
        // body: [count: byte]
        //   per role: [roleId: UTF][level: short][job: byte][gender: byte][displayName: UTF][flag: byte]
        //   per role: [extra1: UTF][extra2: UTF][extra3: UTF]
        // [tail: UTF]
        val roles = listOf(GameBootstrap.defaultRole)
        val body8195 = ResponseWriter.buildBody {
            writeByte(roles.size)
            for (role in roles) {
                writeUTF(role.roleId)
                writeShort(role.level.toInt())
                writeByte(role.job.toInt())
                writeByte(role.gender.toInt())
                writeUTF(role.displayName)
                writeByte(role.flag.toInt())
            }
            for (role in roles) {
                writeUTF(role.extra1)
                writeUTF(role.extra2)
                writeUTF(role.extra3)
            }
            writeUTF("0")
        }
        ResponseWriter.send(ctx, 8195, body8195)
    }
}

data class RoleInfo(
    val roleId: String,
    val level: Short,
    val job: Byte,
    val gender: Byte,
    val displayName: String,
    val flag: Byte,
    val extra1: String,
    val extra2: String,
    val extra3: String,
)

/**
 * 选角进入游戏包 opcode=4250 (0x109A)
 *
 * 由 MainCanvas.g(roleName) 发出，格式与 4100 相同：
 * [account: UTF][token: UTF][roleName: UTF]
 *
 * 真实首轮进图流程（结合客户端 `NetworkPacketProcessors` 与日志）：
 * 1. 8197：角色完整状态
 * 2. 8198：当前地图实体/NPC列表
 * 3. 8199：过渡图“空间通道”
 * 4. 8199：目标图“花果山”
 * 5. 8200：目标图兴趣点坐标
 *
 * 注：8245/8260 也属于完整切图链路，但当前日志里的大包正文被截断，
 * 暂时无法无损复原，因此先补齐客户端真正会消费且当前可完整还原的包。
 */
object EnterGameHandler : CmdHandler {
    override val cmd = 4250

    override fun handle(ctx: ChannelHandlerContext, dis: DataInputStream) {
        val account = dis.readUTF()
        val token = dis.readUTF()
        val roleId = dis.readUTF()

        println("[EnterGame] account=$account roleId=$roleId")

        // 8197 必须与客户端真实读序一致，直接复用真包可避免字段错位。
        ResponseWriter.send(ctx, 8197, GameBootstrap.roleState8197)
        ResponseWriter.send(ctx, 8198, GameBootstrap.mapEntities8198)
        ResponseWriter.send(ctx, 8199, GameBootstrap.spacePassage8199)
        ResponseWriter.send(ctx, 8199, GameBootstrap.huaguoshan8199)
        ResponseWriter.send(ctx, 8200, GameBootstrap.huaguoshanPoints8200)
    }
}

/**
 * 账号登录包 opcode=4098 (0x1002)
 *
 * 业务字段（NetPayloadBuilder#buildLogin，头尾已由 CmdRegistry 剥离）：
 * [r: byte] [s: byte] [username: UTF] [password: UTF] [roleName: UTF]
 */
object AccountLoginHandler : CmdHandler {
    override val cmd = 4098

    override fun handle(ctx: ChannelHandlerContext, dis: DataInputStream) {
        val r = dis.readByte()         // 渠道子类型
        val s = dis.readByte()         // 服务器编号
        val username = dis.readUTF()
        val password = dis.readUTF()
        val roleName = dis.readUTF()

        println("[AccountLogin] username=$username roleName=$roleName server=$s")
        // TODO: 鉴权逻辑
    }
}

private object GameBootstrap {
    val defaultRole = RoleInfo(
        roleId = "id_12_63775455",
        level = 3,
        job = 1,
        gender = 2,
        displayName = "欧阳娜娜",
        flag = 1,
        extra1 = "roles3",
        extra2 = "roles4",
        extra3 = "roles5",
    )

    val roleState8197 = hex(
        "000E69645F31325F36333737353435350003000CE6ACA7E998B3E5A8" +
                "9CE5A89C0102000001000000000000504600000000000000000009313331302F31" +
                "3430300000000000000000000002540BE4000000000000002A0000031C00000320" +
                "00000195000001950000005F000000690000002100000024000000240000002700" +
                "00000B0000002B0000001E00000034FFFF0000000C000000000000000000010000" +
                "000000000000000000000000000000000027000000240100000122E79B8AE6B094" +
                "E4B8B8EFBCA9302F33303009E79B8AE8A180E4B8B8EFBCA9302F33303009E79B8AE5" +
                "8A9BE4B8B8EFBCA9302F33303009E79B8AE699BAE4B8B8EFBCA9302F33303009E79B" +
                "8AE4BD93E4B8B8EFBCA9302F33303009E5BCBAE6B094E4B8B9EFBCA9302F32303009" +
                "E5BCBAE8A180E4B8B9EFBCA9302F32303009E5BCBAE58A9BE4B8B9EFBCA9302F3230" +
                "3009E5BCBAE699BAE4B8B9EFBCA9302F32303009E5BCBAE4BD93E4B8B9EFBCA9302F" +
                "32303009E5A29EE6B094E4B8B9EFBCA9302F31353009E5A29EE8A180E4B8B9EFBCA9" +
                "302F31353009E5A29EE58A9BE4B8B9EFBCA9302F31353009E5A29EE699BAE4B8B9EF" +
                "BCA9302F31353009E5A29EE4BD93E4B8B9EFBCA9302F31353009E4B99DE8BDACE987" +
                "91E4B8B9EFBCA9302F313009000000FF0000"
    )

    val mapEntities8198 = hex(
        "0602BD000EE591A8E78C8EE688B728E594AE290001014001B00000070000000000" +
                "00000CB3000000000000000002BE0009E9BE9FE4B89EE79BB8000101B000E00000" +
                "01000000010000000D03000000000000000002BF0009E6B581E58583E5B8850001" +
                "01B00140000001000000000000000CF0000000000000000002C00009E5969CE78C" +
                "B4E78CB400010020015000000100000000000000041B000000000000000002C100" +
                "09E68792E78CB4E78CB40001006000E000000100000000000000041B0000000000" +
                "00000002C20009E4BA8CE5AFA8E4B8BB0001002000600000410000000000000003" +
                "FD0000000000000000"
    )

    val spacePassage8199 = hex("0001000CE7A9BAE997B4E9809AE98193FFF6FFF600000000")
    val huaguoshan8199 = hex("00070009E88AB1E69E9CE5B1B101A001A000000000")
    val huaguoshanPoints8200 = hex("020130021001900060")
}

private fun hex(value: String): ByteArray {
    require(value.length % 2 == 0) { "hex string length must be even" }
    return ByteArray(value.length / 2) { index ->
        value.substring(index * 2, index * 2 + 2).toInt(16).toByte()
    }
}
