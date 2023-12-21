class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for(i in 1 until food.size){
            repeat(food[i]/2){
                answer += i
            }
        }
        val answerList = answer.toMutableList()
        answerList.sortDescending()
        answerList.map {
            it.toString()
        }
        answer += "0"
        answer += answerList.joinToString("")
        
        println(answer)
        return answer
        }
}
