class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val ternaryString = n.toString(3)
        val reversedTernary = ternaryString.reversed()
        answer = reversedTernary.toInt(3)
        return answer
    }
}
//n.toString(3).reversed().toInt(3)