import java.math.BigInteger
import java.math.RoundingMode
import kotlin.math.floor
import kotlin.math.roundToLong
import kotlin.math.round

class Codewars() {
    fun londonCityHacker(journey: Array<Any>): String {

        var buses = journey.count { it is Int }
        var buses2: Double = 0.0
        if (buses % 2 != 0 && buses > 2) {
            buses2 = (((buses / 2) + 1) * 1.5)
        } else if(buses>2) buses2 = (buses * 1.5) / 2
        else buses2 = buses*1.5

        val tube = journey.count { it is String } * 2.4

        val sum = (tube + buses2).toBigDecimal().setScale(2, RoundingMode.UP)
        return "£" + sum.toDouble() + "0"
    }

}