import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
    var answer: Int = 0
    for(i in left..right){
        if(findDivisor(i))
            answer += i
        else
            answer -= i
    }
    return answer
}
    fun findDivisor(n: Int): Boolean{
        val endNumber = sqrt(n.toDouble())
        val divisorList = mutableListOf<Int>()

        for(i in 1..endNumber.toInt()){
            if(n % i == 0){
                divisorList.add(i)
            }
        }

        var resultList = divisorList.toMutableList()
        for(divisor in divisorList){
            if(n % divisor == 0){
                resultList.add(n/divisor)
            }
        }
        resultList = resultList.distinct().toMutableList()

        return if(resultList.size % 2 == 0)
            true
        else
            false
    }
}