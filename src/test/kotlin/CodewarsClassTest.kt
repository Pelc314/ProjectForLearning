import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

import java.math.BigInteger.valueOf

class CodewarsTest {
    val codeWars = Codewars()

    @Test
    fun bigTest() {
        assertEquals("ten", codeWars.wallpaper(4.0, 3.5, 3.0))
        assertEquals("sixteen", codeWars.wallpaper(6.3, 4.5, 3.29))
        assertEquals("zero", codeWars.wallpaper(8.49, 9.16, 0.0))
        assertEquals("£7.80", codeWars.londonCityHacker(arrayOf(12, "Central", "Circle", 21)));
        assertEquals("£7.20", codeWars.londonCityHacker(arrayOf("Northern", "Central", "Circle")));
        assertEquals("£5.40", codeWars.londonCityHacker(arrayOf("Piccidilly", 56, 93, 243)));

    }


}