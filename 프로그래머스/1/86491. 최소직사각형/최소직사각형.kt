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
        val min = minList.maxOrNull() ?: 0
        val max = maxList.maxOrNull() ?: 0

        println("minList: $minList")
        println("maxList: $maxList")
        println("min: $min, max: $max")

        answer = min * max
        println(answer)
        return answer
    }
}