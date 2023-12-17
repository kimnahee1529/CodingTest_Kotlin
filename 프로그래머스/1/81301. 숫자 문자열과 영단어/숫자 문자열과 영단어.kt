class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
        val numToWordMap  = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
        )

        var resultString = s
        numToWordMap.forEach { word, number ->
            resultString = resultString.replace(word, number.toString())
        }

        answer = resultString.toInt()
        return answer
    }
}