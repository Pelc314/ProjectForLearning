import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CodewarsTest{
    @Test
    fun checkIfFunctionReturnsEmptyStringForEmptyArr(){
        val expected = ""
        val codewars = Codewars()
        val tmp = intArrayOf()
        val result = codewars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }

    @Test
    fun checkIfFunctionReturnsDistinctNumbers(){
        val expected = "2,4,6"
        val codewars = Codewars()
        val tmp = intArrayOf(2,4,6)
        val result = codewars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }

    @Test
    fun checkIfFunctionReturnsRangeNumbers(){
        val expected = "7-11"
        val codewars = Codewars()
        val tmp = intArrayOf(7,8,9,10,11)
        val result = codewars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }
}