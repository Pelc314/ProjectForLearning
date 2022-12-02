import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

import java.math.BigInteger.valueOf

class FabergeTest {

    val codewarsFaberge = Codewars()
    private fun test(a: Int, b: Int, shouldBe: Int) {
        assertEquals(valueOf(shouldBe.toLong()), codewarsFaberge.height(valueOf(a.toLong()), valueOf(b.toLong())))
    }

    private fun test(a: String, b: String, shouldBe: String) {
        assertEquals(
            BigInteger(shouldBe),
            codewarsFaberge.height(BigInteger(a), BigInteger(b))
        )
    }

    @Test
    fun testForZeroEggs() {
        assertEquals(
            0.toBigInteger(), codewarsFaberge.height(0.toBigInteger(), 14.toBigInteger())
        )
    }

    @Test
    fun testForZeroTries() {
        assertEquals(
            0.toBigInteger(), codewarsFaberge.height(2.toBigInteger(), 0.toBigInteger())
        )
    }

    @Test
    @Throws(Exception::class)
    fun basicTests() {
        test(1, 51, 51)
        test(2, 1, 1)
        test(4, 17, 3213)
        test(16, 19, 524096)
        test(23, 19, 524287)
    }

    @Test
    @Throws(Exception::class)
    fun advancedTests() {
        test("13", "550", "60113767426276772744951355")
        test(
            "271",
            "550",
            "1410385042520538326622498273346382708200418583791594039531058458108130216985983794998105636900856496701928202738750818606797013840207721579523618137220278767326000095"
        )
        test(
            "531",
            "550",
            "3685510180489786476798393145496356338786055879312930105836138965083617346086082863365358130056307390177215209990980317284932211552658342317904346433026688858140133147"
        )
    }
}

class CodewarsTest {
    val codeWars = Codewars()

    @Test
    fun bigTest() {
        assertEquals("£7.80",codeWars.londonCityHacker(arrayOf(12, "Central", "Circle", 21)));
      //  assertEquals("!BCD!", codeWars.replace("ABCDE"))
        assertEquals("left", codeWars.elevator(0, 1, 0))
        assertEquals("right", codeWars.elevator(0, 1, 1))
        assertEquals("right", codeWars.elevator(0, 1, 2))
        assertEquals("right", codeWars.elevator(0, 0, 0))
        assertEquals("right", codeWars.elevator(0, 2, 1))
    }

    @Test
    fun reverseSeqTest() {
        assertEquals((listOf(5, 4, 3, 2, 1)), codeWars.reverseSeq(5))
    }

    @Test
    fun dutyFreeTest() {
        assertEquals(357, codeWars.dutyFree(24, 35, 3000))
        assertEquals(166, codeWars.dutyFree(12, 50, 1000))
        assertEquals(294, codeWars.dutyFree(17, 10, 500))

    }

    @Test
    fun centuryTest() {
        assertEquals(1, codeWars.century(89));
        assertEquals(18, codeWars.century(1705));
        assertEquals(19, codeWars.century(1900));
        assertEquals(17, codeWars.century(1601));
        assertEquals(20, codeWars.century(2000));
        assertEquals(1, codeWars.century(89));
    }

    @Test
    fun growTest() {
        assertEquals(6, codeWars.grow(intArrayOf(1, 2, 3)))
    }

    @Test
    fun testSubtractsSum() {
        assertEquals("apple", codeWars.subtractSum(4991))
    }

    @Test
    fun testFixed() {
        assertArrayEquals(intArrayOf(-1, -2, -3, -4, -5), codeWars.invert(intArrayOf(1, 2, 3, 4, 5)))
        assertArrayEquals(intArrayOf(-1, 2, -3, 4, -5), codeWars.invert(intArrayOf(1, -2, 3, -4, 5)))
        assertArrayEquals(intArrayOf(), codeWars.invert(intArrayOf()))
        assertArrayEquals(intArrayOf(0), codeWars.invert(intArrayOf(0)))
    }

    @Test
    fun checkFindEvenIndex() {
        assertEquals(3, codeWars.findEvenIndex(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
    }

    @Test
    fun checkIfFunctionReturnsEmptyStringForEmptyArr() {
        val expected = ""
        val tmp = intArrayOf()
        val result = codeWars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }

    @Test
    fun checkIfFunctionReturnsDistinctNumbers() {
        val expected = "2,4,6"
        val codewars = Codewars()
        val tmp = intArrayOf(2, 4, 6)
        val result = codewars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }

    @Test
    fun checkIfFunctionReturnsRangeNumbers() {
        val expected = "7-11"
        val codewars = Codewars()
        val tmp = intArrayOf(7, 8, 9, 10, 11)
        val result = codewars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }

    @Test
    fun checkIfFunctionReturnsRangeNumbersAndIndividualNumbers() {
        val expected = "1,3,5,7-11,13,20,22,25-28,41"
        val codewars = Codewars()
        val tmp = intArrayOf(1, 3, 5, 7, 8, 9, 10, 11, 13, 20, 22, 25, 26, 27, 28, 41)
        val result = codewars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }
}