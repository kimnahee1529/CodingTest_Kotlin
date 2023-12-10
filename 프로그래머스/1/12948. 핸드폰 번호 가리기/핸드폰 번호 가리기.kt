class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        val len = phone_number.length-4
        repeat(len){
            answer += "*"
        }
        answer += phone_number.takeLast(4)
        return answer
    }
}