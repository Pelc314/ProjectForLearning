class Codewars() {
    fun rangeExtraction(arr: IntArray): String {
        var result = ""
        val rangeList = mutableListOf<Int>()
        val individualList = mutableListOf<Int>()

        for (i in 0 until arr.size) {

            rangeList.add(arr[i])
        }
        //TODO create a 2d array for range list where ranges will be in array<array>
//        println(rangeList.joinToString { it.toString() } + "rangeList")
//        println(individualList.joinToString { it.toString() } + "individualList")

        val separetedRangeList = mutableListOf<Int>()

        return rangeList.joinToString(",") { it.toString() }
    }

}

class PracticeClass() {
    fun solution(A: IntArray): IntArray {
        val newArray = A.clone()
        newArray[1] = 150234
        return newArray
    }
}