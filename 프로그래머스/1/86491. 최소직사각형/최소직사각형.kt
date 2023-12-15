import kotlin.math.*
class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0

        val minList = sizes.map {
            it.minOrNull() ?: 0
        }

        val maxList = sizes.map {
            it.maxOrNull() ?: 0
        }
  
        val firstMax = minList.maxOrNull() ?: 0
        val secondMax = maxList.maxOrNull() ?: 0

        answer = firstMax * secondMax
        return answer
    }
}