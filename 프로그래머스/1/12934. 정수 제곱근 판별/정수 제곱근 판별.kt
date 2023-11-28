import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val sqrtNumber = sqrt(n.toDouble()).toLong()
        if(n == (sqrtNumber *sqrtNumber).toLong()) {
            return ((sqrtNumber+1) * (sqrtNumber+1))
        }else{
            return -1
        }
    }
}