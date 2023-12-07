class Solution {
    fun solution(s: String): String {
        var answer = ""
        val stringLength = s.length/2
        if(s.length % 2 == 0)
            answer += (s[stringLength-1].toString() + s[stringLength].toString())
        else
            answer += s[stringLength].toString()

        return answer
    }
}