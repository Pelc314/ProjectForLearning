import java.math.RoundingMode
import kotlin.math.abs
import kotlin.math.ceil

class CodeWars() {
    fun gps(s: Int, x: DoubleArray): Int {
        var sections = mutableListOf<Double>()

        for (i in 0 until x.size - 1) {
            val tmp = abs((3600 * (x[i] - x[i + 1])) / s)
            sections.add(tmp)
        }
        println(sections)
        println(sections.average())
        if (sections.isEmpty()) {
            return 5
        }
        val result: Int = sections.maxOrNull()!!.toInt()
        return result.toInt()
    }

    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
        var counter = 0
        var population = pp0
        while (population < p) {
            population = (population + population * (percent / 100) + aug).toInt()
            counter++
            println(population)
        }
        return counter
    }

    fun fizzBuzz(n: Int): Array<String> {
        val resultList = mutableListOf<String>()
        for (i in 0 until n) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultList.add("FizzBuzz")
            } else if (i % 5 == 0) {
                resultList.add("Buzz")
            } else if (i % 3 == 0) {
                resultList.add("Fizz")
            } else resultList.add(i.toString())
        }
        println(resultList)
        return resultList.toTypedArray()
    }

    fun wallpaper(l: Double, w: Double, h: Double): String {
        val sumOfm2Walls: Double = ((l * h) * 2 + (w * h) * 2) * 1.15
        val oneRollM2: Double = 10 * 0.52
        var result = sumOfm2Walls / oneRollM2

        val numbers = listOf<String>(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty"
        )
        if (w.toInt() == 0 || h.toInt() == 0 || l.toInt() == 0) result = 0.0
        for (i in 0..numbers.size - 1) {
            if (ceil(result).toInt() == i) return numbers[i]
        }
        return ceil(result).toString()
    }

    fun londonCityHacker(journey: Array<Any>): String {
        var buses = journey.count { it is Int }
        var buses2: Double = 0.0
        if (buses % 2 != 0 && buses > 2) {
            buses2 = (((buses / 2) + 1) * 1.5)
        } else if (buses > 2) buses2 = (buses * 1.5) / 2
        else buses2 = buses * 1.5

        val tube = journey.count { it is String } * 2.4

        val sum = (tube + buses2).toBigDecimal().setScale(2, RoundingMode.UP)
        return "£" + sum.toDouble() + "0"
    }
}
