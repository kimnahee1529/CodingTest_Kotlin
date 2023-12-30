class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for(i in 0 until nums.size-2){
            for(j in i+1 until nums.size-1){
                for(k in j+1 until nums.size){
                    if(isPrime(nums[i] + nums[j] + nums[k]))
                        answer+=1
                }
            }
        }
        return answer
    }
    
    fun isPrime(x: Int): Boolean {
        for (i in 2 until x) {	// 2부터 x-1까지 반복
            if (x % i == 0) return false	// x가 한 번이라도 나누어 떨어지면 소수가 아님
        }
        return true	// 모두 반복해도 나누어 떨어지지 않으면 소수
    }
}
