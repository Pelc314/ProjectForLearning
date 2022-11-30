import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PaginationHelperTest {
    val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'b', 'c', 'd', 'e', 'f', 'b', 'c', 'd', 'e', 'f', 'b', 'c', 'd', 'e', 'f','2','2','3'), 10)

    @Test
    fun itemCountTest() {
        val result = helper.itemCount
        assertEquals(24, result)
    }

    @Test
    fun pageCountTest() {
        val result = helper.pageCount
        assertEquals(3, result)
    }

    @Test
    fun pageItemCountTest() {
        val result = helper.pageItemCount(2)
        assertEquals(4, result)
    }

    @Test
    fun pageIndexTest() {
        val result = helper.pageIndex(-1)
        assertEquals(-1, result)
    }
}