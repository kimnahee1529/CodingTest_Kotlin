import java.util.Collections.max
class Solution {
    fun solution(answers: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val patterns = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        val score = mutableListOf(0,0,0)
    
        answers.forEachIndexed { index, i ->
            val indexA = index % patterns[0].size
            val indexB = index % patterns[1].size
            val indexC = index % patterns[2].size
            if(i == patterns[0][indexA]){
                score[0]++
            }
            if(i == patterns[1][indexB]){
                score[1]++
            }
            if(i == patterns[2][indexC]){
                score[2]++
            }
        }
    
        score.forEachIndexed { index, i ->
            if(i == max(score)){
                answer.add(index+1)
            }
        }
        return answer.toIntArray()
    }
}