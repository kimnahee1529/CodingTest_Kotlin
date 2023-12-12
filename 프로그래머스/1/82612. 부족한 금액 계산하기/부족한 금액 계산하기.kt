class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
            for(i in 1..count)
                answer += (i * price)
            if(money > answer)
                return 0
            else
                return answer-money

    }
}