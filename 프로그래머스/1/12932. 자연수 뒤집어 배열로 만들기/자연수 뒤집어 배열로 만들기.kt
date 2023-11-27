class Solution {
    fun solution(n: Long): IntArray {

        val answer = n.toString().map { it.toString().toInt() }.reversed().toIntArray()
        
        return answer
    }
}