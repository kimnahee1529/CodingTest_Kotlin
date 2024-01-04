class Solution {
    fun solution(s: String): String {
        var answer = ""
        answer = (s.map { it.toString() }.sortedDescending()).joinToString("")
        return answer
    }
}
