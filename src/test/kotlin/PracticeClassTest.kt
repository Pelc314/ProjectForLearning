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
        val expected = "1-3"
        val codewars = Codewars()
        val tmp = intArrayOf(1,2,3)
        val result = codewars.rangeExtraction(tmp)
        assertEquals(expected, result)
    }
}