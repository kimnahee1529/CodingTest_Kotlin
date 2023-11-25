import kotlin.math.*

class Solution {
    fun solution(x: Int, n: Int): List<Long> {
        val answerList = mutableListOf<Long>()
        var sum = 0
         for (i in 1..n) {
            answerList.add(i.toLong() * x)
        }
        println(answerList)
        return answerList
    }
}

// for (i in 1..n step abs(x)) {
//             println("i:${i}")
//              sum += i
//             answerList.add(sum)
//         }