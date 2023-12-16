class Solution {
    fun solution(s: String): String {
        var answer = ""
        val stringLength = s.length/2
        val evenLength = if(s.length % 2 == 0) stringLength-1 else stringLength
        answer = s.slice(evenLength..stringLength)
        return answer
    }
}
