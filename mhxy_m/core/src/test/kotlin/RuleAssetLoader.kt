import java.io.ByteArrayInputStream
import java.io.DataInputStream

open class RuleAsset(val rules: List<Rule>) {
    open fun getRuleById(id: Short): Rule? {
        return rules.find { it.id == id }
    }
}

data class Rule(val key: Int, val id: Short)

fun parseRuleAsset(data: ByteArray): RuleAsset {
    DataInputStream(ByteArrayInputStream(data)).use { dis ->
        val count = dis.readShort().toInt()
        val rules = mutableListOf<Rule>()
        repeat(count) {
            rules += Rule(dis.readInt(), dis.readShort())
        }
        return RuleAsset(rules)
    }
}