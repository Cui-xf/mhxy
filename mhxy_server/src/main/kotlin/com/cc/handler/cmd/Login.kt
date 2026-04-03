package com.cc.handler.cmd

import com.cc.handler.util.ResponseWriter
import io.netty.channel.ChannelHandlerContext
import java.io.DataInputStream
import java.util.*

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

        // opcode=8195：下发角色列表（来源：GlobalStatus.a(DataInputStream) 第1097行）
        // body: [count: byte]
        //   per role: [name: UTF][level: short][job: byte][gender: byte][serverName: UTF][nD: byte]
        //   per role: [UTF][UTF][UTF]  （3个附加字段，内容不明，用空字符串占位）
        // [UTF]  （末尾1个全局字段，内容不明，用空字符串占位）
        val roles = listOf(
            RoleInfo(name = "测试角色", level = 1, job = 0, gender = 0, serverName = "测试服")
        )
        val body8195 = ResponseWriter.buildBody {
            writeByte(roles.size)
            for (role in roles) {
                writeUTF(role.name)
                writeShort(role.level.toInt())
                writeByte(role.job.toInt())
                writeByte(role.gender.toInt())
                writeUTF(role.serverName)
                writeByte(0)        // nD[i]，用途不明
            }
            for (role in roles) {
                writeUTF("")        // 附加字段1
                writeUTF("")        // 附加字段2
                writeUTF("")        // 附加字段3
            }
            writeUTF("")            // 末尾全局字段
        }
        ResponseWriter.send(ctx, 8195, body8195)
    }
}

data class RoleInfo(
    val name: String,
    val level: Short,
    val job: Byte,
    val gender: Byte,
    val serverName: String,
)

/**
 * 选角进入游戏包 opcode=4250 (0x109A)
 *
 * 由 MainCanvas.g(roleName) 发出，格式与 4100 相同：
 * [account: UTF][token: UTF][roleName: UTF]
 *
 * 服务端回复 opcode=8197，body 对应 GlobalStatus.d(DataInputStream)：
 * [roleName:UTF][level:short][mapName:UTF][job:byte][gender:byte][title:UTF]
 * [color:byte][exp:long][maxExp:long][mapId:long][gold:long][bindGold:long][totalGold:long]
 * [x:int][y:int][destX:int][destY:int][maxHp:int][hp:int][maxMp:int][mp:int]
 * [maxSp:int][sp:int][maxOp:int][op:int][atkMin:int][atkMax:int]
 * [petSlot:short(若>-1: petX:short,petY:short,petDir:short)]
 * [guildName:UTF][guildLevel:short][guildJob:byte]
 * [unknown1:UTF][unknown2:UTF][unknown3:int][unknown4:byte]
 * [unknown5:UTF][unknown6:UTF][unknown7:UTF][unknown8:UTF][unknown9:UTF]
 * [aW:int][aX:int][aY:int][bA:byte]
 * [bB:UTF][bn:UTF][bo:UTF]
 * [aI:byte]
 * [nm:byte(若>0: nn:UTF,no:short,np:short,nq:short)]
 * [bd:UTF]
 */
object EnterGameHandler : CmdHandler {
    override val cmd = 4250

    override fun handle(ctx: ChannelHandlerContext, dis: DataInputStream) {
        val account = dis.readUTF()
        val token = dis.readUTF()
        val roleName = dis.readUTF()

        println("[EnterGame] account=$account roleName=$roleName")

        val body8197 = ResponseWriter.buildBody {
            writeUTF(roleName)      // ad: 角色名
            writeShort(1)           // ak: 等级
            writeUTF("新手村")      // ag: 地图名
            writeByte(0)            // aj: 职业
            writeByte(0)            // ax: 性别
            writeUTF("")            // ah: 称号
            writeByte(0)            // ai: 颜色 byte（LoadingPage.a 转换）
            writeLong(0)            // ap: 当前经验
            writeLong(100)          // aq: 升级所需经验
            writeLong(0)            // al: 地图ID
            writeLong(0)            // am: 金币
            writeLong(0)            // an: 绑定金币
            writeLong(0)            // ao: 累计金币
            writeInt(50)            // aN: x坐标
            writeInt(50)            // aM: y坐标
            writeInt(50)            // aP: 目标x
            writeInt(50)            // aO: 目标y
            writeInt(100)           // aR: 最大HP
            writeInt(100)           // aQ: 当前HP
            writeInt(100)           // aT: 最大MP
            writeInt(100)           // aS: 当前MP
            writeInt(100)           // aV: 最大SP
            writeInt(100)           // aU: 当前SP
            writeInt(100)           // aZ: 最大OP
            writeInt(100)           // bc: 当前OP
            writeInt(10)            // ba: 最小攻击
            writeInt(20)            // bb: 最大攻击
            writeShort(-1)          // be: 宠物槽位（-1表示无宠物）
            writeUTF("")            // bh: 帮派名
            writeShort(0)           // bf: 帮派等级
            writeByte(0)            // bg: 帮派职位
            writeUTF("")            // az: unknown1
            writeUTF("")            // aA: unknown2
            writeInt(0)             // aB: unknown3
            writeByte(0)            // ay: unknown4
            writeUTF("")            // bi
            writeUTF("")            // bj
            writeUTF("")            // bk
            writeUTF("")            // bl
            writeUTF("")            // bm
            writeInt(0)             // aW
            writeInt(0)             // aX
            writeInt(0)             // aY
            writeByte(0)            // bA: VIP等级
            writeUTF("")            // bB
            writeUTF("")            // bn: 最后死亡记录（空时客户端改为"暂无记录。"）
            writeUTF("")            // bo
            writeByte(0)            // aI
            writeByte(0)            // nm: 坐骑标志（0=无坐骑）
            writeUTF("")            // bd
        }
        ResponseWriter.send(ctx, 8197, body8197)
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
