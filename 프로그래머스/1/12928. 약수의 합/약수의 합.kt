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
        // println(answerList)
        
        for (i in 0..answerList.size-1){
            if(n % answerList[i] == 0){
                answerList.add(n / answerList[i])
            }
        }

        // answerList = answerList.distinct()
        // println(answerList)
        // println(answerList.distinct())
        
        return answerList.distinct().sum()
    }
}