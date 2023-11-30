class Solution {
    fun solution(num: Int): Int {
        var n: Long  = num.toLong()
        var answer = 0
        while(answer<500){
            if(n == 1L){
                return answer
            }
            else{
                if(n%2==0L){
                    n = n / 2
                }else{
                    n = n * 3 + 1
                }
            }
            answer = answer + 1
        }
        answer = -1
        return answer
    }
}