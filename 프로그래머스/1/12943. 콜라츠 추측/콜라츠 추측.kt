class Solution {
    fun solution(num: Int): Int {
    var number = num.toLong()
    var answer = 0
    while(answer<500){
        if(number == 1L){
            return answer
        }
        else{
            if(number%2==0L){
                number /= 2
            }else{
                number = number * 3 + 1
            }
        }
        answer++
    }
    answer = -1
    return answer
    }
}