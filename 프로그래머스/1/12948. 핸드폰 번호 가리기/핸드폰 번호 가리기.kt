class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        val number_length = phone_number.length
        answer = answer.padStart(number_length-4,'*') + phone_number.takeLast(4)
        return answer
    }
}