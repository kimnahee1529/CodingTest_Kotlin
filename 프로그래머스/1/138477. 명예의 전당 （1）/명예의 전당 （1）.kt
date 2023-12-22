import java.util.Collections.min
class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = mutableListOf<Int>()
    
        val highestList = mutableListOf<Int>()
        val pickHighestList = mutableListOf<Int>()
        score.forEach {
            highestList.add(it)
            highestList.sortDescending()
            highestList.forEachIndexed { index, i ->
                if(index<k){
                    pickHighestList.add(i)
                }
            }
            answer.add(min(pickHighestList))
            pickHighestList.clear()
        }
    
        return answer.toIntArray()
    }
}