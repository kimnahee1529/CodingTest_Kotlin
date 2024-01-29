class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer = 0
        val regex = "aya|ye|woo|ma".toRegex()
        val repeatRegex = "ayaaya|yeye|woowoo|mama".toRegex()
    
        for (babble in babbling) {
            if (babble.contains(repeatRegex)) {
                continue
            }
            val res = babble.replace(regex, "")
            if (res.isEmpty()) {
                answer++
            }
        }
        return answer
    }
}