import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int { 
        
        val N = (sqrt(n.toDouble())).toInt()
        val answerList = mutableListOf<Int>()
        
        for (i in 1..N){
            if(n % i == 0){
                answerList.add(i)
            }
        }
        
        for (i in 0..answerList.size-1){
            if(n % answerList[i] == 0){
                answerList.add(n / answerList[i])
            }
        }
        
        return answerList.distinct().sum()
    }
}
