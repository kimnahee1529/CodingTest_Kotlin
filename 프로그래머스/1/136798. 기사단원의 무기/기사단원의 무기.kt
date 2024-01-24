import kotlin.math.sqrt
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for (i in 1..number){
            if(findDivisor(i)>limit){
                answer += power
            }else{
                answer += findDivisor(i)
            }
        }
        println(answer)
        return answer
    }
}

fun findDivisor(n: Int): Int {
    val endNumber = sqrt(n.toDouble())
    val divisorList = mutableListOf<Int>()
    val divisorList2 = mutableListOf<Int>()

    if(n != 1){
        for (i in 1..endNumber.toInt()) {
            if (n % i == 0) {
                divisorList.add(i)
            }
        }
        for(divisor in divisorList){
            if(n % divisor == 0){
                divisorList2.add(n/divisor)
            }
        }
    }else{
        divisorList.add(1)
    }
    divisorList2.sort()
    val resultList = (divisorList+divisorList2).distinct()
    return resultList.size
}
