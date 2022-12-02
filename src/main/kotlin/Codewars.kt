import java.math.BigInteger
import kotlin.math.floor

class Codewars() {
    fun londonCityHacker(journey: Array<Any>): String {
        val buses:Double = journey.count{it is String}.toFloat() * 1.5
        val tube = journey.count{it is Int} * 2.4
        val sum = tube + buses
        return "£"+sum+"0"
    }

}