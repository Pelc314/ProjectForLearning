import java.math.BigInteger

class Codewars() {

    fun subtractSum(n: Int): String {
        var tmp = n.toString()
        var sum = 0
        var result = "err"
        while (result=="err"){
            for (element in tmp) {
                sum += element.digitToInt()
            }
            tmp = (n - sum).toString()
            result = checkWhatFruit(tmp.toInt())
        }
        return result
    }


    fun invert(arr: IntArray): IntArray {
        val tmp = mutableListOf<Int>()
        for (i in arr.indices) {
            tmp.add(arr[i] * -1)
        }
        return tmp.toIntArray()
    }

    fun findEvenIndex(arr: IntArray): Int {
        for (i in arr.indices) {
            val sumLeft = arr.copyOfRange(0, i).sum()
            val sumRight = arr.copyOfRange(i + 1, arr.size).sum()
            println("$sumLeft SumLeft")
            println("$sumRight Sum Right")
            if (sumLeft == sumRight) {
                return i
            }
        }
        return -1
    }

    fun height(n: BigInteger, m: BigInteger): BigInteger {

        return n * m // do it!
    }

    fun rangeExtraction(arr: IntArray): String {
        var result = ""
        val rangeList = mutableListOf<Any?>()
        val individualList = mutableListOf<Int>()

        for (i in 0 until arr.size - 1) {

            if (arr[i] + 1 != arr[i + 1]) {
                individualList.add(arr[i])
                if (arr[arr.size - 1] != arr[i] + 1 && i == arr.size - 2) {
                    individualList.add(arr[arr.size - 1])
                }
            } else {
                rangeList.add("?")
                rangeList.add(arr[i])
                rangeList.add("-")
                var iterator = 0
                for (j in i until arr.size) {
                    if (arr[i] + iterator != arr[j]) {
                        rangeList.add(arr[i - 1])
                    }
                    iterator++
                }
                if (arr[arr.size - 1] == arr[i] + 1 && i == arr.size - 2) {
                    rangeList.add(arr[arr.size - 1])
                    rangeList.add("?")
                }

            }
        }
        println(rangeList.joinToString { it.toString() } + " rangeList")
        println(" rangeList")
        println(individualList.joinToString { it.toString() } + " individualList")

        val separetedRangeList = mutableListOf<Any?>()

        for (i in 0 until rangeList.size) {

        }

        if (rangeList.isEmpty()) {
            result = individualList.joinToString(",") { it.toString() }
        } else if (individualList.isEmpty()) {
            result = rangeList[0].toString() + "-" + rangeList[rangeList.size - 1].toString()
        }

        return result
    }

    private fun checkWhatFruit(sum: Int): String {
        if (sum == 1) return "kiwi"
        if (sum == 2) return "pear"
        if (sum == 3) return "kiwi"
        if (sum == 4) return "banana"
        if (sum == 5) return "melon"
        if (sum == 6) return "banana"
        if (sum == 7) return "melon"
        if (sum == 8) return "pineapple"
        if (sum == 9) return "apple"
        if (sum == 10) return "pineapple"
        if (sum == 11) return "cucumber"
        if (sum == 12) return "pineapple"
        if (sum == 13) return "cucumber"
        if (sum == 14) return "orange"
        if (sum == 15) return "grape"
        if (sum == 16) return "orange"
        if (sum == 17) return "grape"
        if (sum == 18) return "apple"
        if (sum == 19) return "grape"
        if (sum == 20) return "cherry"
        if (sum == 21) return "pear"
        if (sum == 22) return "cherry"
        if (sum == 23) return "pear"
        if (sum == 24) return "kiwi"
        if (sum == 25) return "banana"
        if (sum == 26) return "kiwi"
        if (sum == 27) return "apple"
        if (sum == 28) return "melon"
        if (sum == 29) return "banana"
        if (sum == 30) return "melon"
        if (sum == 31) return "pineapple"
        if (sum == 32) return "melon"
        if (sum == 33) return "pineapple"
        if (sum == 34) return "cucumber"
        if (sum == 35) return "orange"
        if (sum == 36) return "apple"
        if (sum == 37) return "orange"
        if (sum == 38) return "grape"
        if (sum == 39) return "orange"
        if (sum == 40) return "grape"
        if (sum == 41) return "cherry"
        if (sum == 42) return "pear"
        if (sum == 43) return "cherry"
        if (sum == 44) return "pear"
        if (sum == 45) return "apple"
        if (sum == 46) return "pear"
        if (sum == 47) return "kiwi"
        if (sum == 48) return "banana"
        if (sum == 49) return "kiwi"
        if (sum == 50) return "banana"
        if (sum == 51) return "melon"
        if (sum == 52) return "pineapple"
        if (sum == 53) return "melon"
        if (sum == 54) return "apple"
        if (sum == 55) return "cucumber"
        if (sum == 56) return "pineapple"
        if (sum == 57) return "cucumber"
        if (sum == 58) return "orange"
        if (sum == 59) return "cucumber"
        if (sum == 60) return "orange"
        if (sum == 61) return "grape"
        if (sum == 62) return "cherry"
        if (sum == 63) return "apple"
        if (sum == 64) return "cherry"
        if (sum == 65) return "pear"
        if (sum == 66) return "cherry"
        if (sum == 67) return "pear"
        if (sum == 68) return "kiwi"
        if (sum == 69) return "pear"
        if (sum == 70) return "kiwi"
        if (sum == 71) return "banana"
        if (sum == 72) return "apple"
        if (sum == 73) return "banana"
        if (sum == 74) return "melon"
        if (sum == 75) return "pineapple"
        if (sum == 76) return "melon"
        if (sum == 77) return "pineapple"
        if (sum == 78) return "cucumber"
        if (sum == 79) return "pineapple"
        if (sum == 80) return "cucumber"
        if (sum == 81) return "apple"
        if (sum == 82) return "grape"
        if (sum == 83) return "orange"
        if (sum == 84) return "grape"
        if (sum == 85) return "cherry"
        if (sum == 86) return "grape"
        if (sum == 87) return "cherry"
        if (sum == 88) return "pear"
        if (sum == 89) return "cherry"
        if (sum == 90) return "apple"
        if (sum == 91) return "kiwi"
        if (sum == 92) return "banana"
        if (sum == 93) return "kiwi"
        if (sum == 94) return "banana"
        if (sum == 95) return "melon"
        if (sum == 96) return "banana"
        if (sum == 97) return "melon"
        if (sum == 98) return "pineapple"
        if (sum == 99) {
            println("JAPKO")
            return "apple"
        }
        if (sum == 100) return "pineapple"
        return "err"
    }
}

class PracticeClass() {
    fun solution(A: IntArray): IntArray {
        val newArray = A.clone()
        newArray[1] = 150234
        return newArray
    }
}

class PaginationHelper<T>(val collection: List<T>, val itemsPerPage: Int) {

    /**
     * returns the number of items within the entire collection
     */
    val itemCount: Int
        get() {
            return collection.size
        }

    /**
     * returns the number of pages
     */
    val pageCount: Int
        get() {
            return (itemCount / itemsPerPage).inc()
        }


    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    fun pageItemCount(pageIndex: Int): Int {
        if (pageIndex > pageCount || pageIndex < 0) return -1
        if (pageIndex != pageCount - 1) return itemsPerPage
        return collection.size - (itemsPerPage * (pageCount - 1))
    }


    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int {
        println(itemIndex)
        if (itemIndex > collection.size - 1 || itemIndex < 0) return -1
        return itemIndex / itemsPerPage
    }
}