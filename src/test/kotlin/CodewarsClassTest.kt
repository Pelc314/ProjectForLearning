import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GpsSpeedTest {
    val codeWars = CodeWars()

    @Test
    fun test1() {
        println("Fixed Tests: gps")
        var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
        testing(codeWars.gps(20, x), 41)
        x = doubleArrayOf(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
        testing(codeWars.gps(12, x), 219)
    }
    companion object {
        private fun randInt(min: Int, max: Int): Int {
            return min + (Math.random() * ((max - min) + 1)).toInt()
        }
        private fun testing(actual: Int, expected: Int) {
            assertEquals(expected, actual)
        }
    }
}

class CodeWarsTest {
    val codeWars = CodeWars()

    private fun testing(actual: Int, expected: Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun test1() {
        testing(codeWars.nbYear(1500, 5.0, 100, 5000), 15)
        testing(codeWars.nbYear(1500000, 2.5, 10000, 2000000), 10)
    }

    @Test
    fun bigTest() {
        assertEquals("ten", codeWars.wallpaper(4.0, 3.5, 3.0))
        assertEquals("sixteen", codeWars.wallpaper(6.3, 4.5, 3.29))
        assertEquals("zero", codeWars.wallpaper(8.49, 9.16, 0.0))
        assertEquals("£7.80", codeWars.londonCityHacker(arrayOf(12, "Central", "Circle", 21)))
        assertEquals("£7.20", codeWars.londonCityHacker(arrayOf("Northern", "Central", "Circle")))
        assertEquals("£5.40", codeWars.londonCityHacker(arrayOf("Piccidilly", 56, 93, 243)))
    }
}
