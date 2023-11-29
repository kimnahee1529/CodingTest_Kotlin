class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        
        var min = Integer.min(a,b)
        val max = Integer.max(a,b)
        
        for (i in min..max)
                answer += i
        
        return answer
    }
}