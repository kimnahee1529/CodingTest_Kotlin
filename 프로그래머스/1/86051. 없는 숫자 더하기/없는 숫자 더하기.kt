class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        val zeroToNine = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val numberArray = numbers.toMutableSet()

        val result = zeroToNine.subtract(numberArray)
        answer = result.sum()

        return answer
    }
}