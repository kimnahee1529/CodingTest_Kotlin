class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        for(i in arr){
            if(i % divisor == 0){
                println(i)
                answer.plus(i)
            }
        }
        return answer
    }
}