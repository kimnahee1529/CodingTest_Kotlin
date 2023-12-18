class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        answer = strings.sortedWith(compareBy<String> { it[n] }.thenBy { it }).toTypedArray()
        return answer
    }
}