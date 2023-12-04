class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        val number_length = phone_number.length
        val last_number_length = 4
        answer = answer.padStart(number_length-last_number_length,'*') + phone_number.takeLast(last_number_length)
        return answer
    }
}