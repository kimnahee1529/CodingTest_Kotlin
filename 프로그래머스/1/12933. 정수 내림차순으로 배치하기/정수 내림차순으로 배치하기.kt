class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        answer = n.toString().map{ it.toString().toLong()}.sortedDescending().joinToString("").toLong()

        return answer
    }
}