class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        signs.forEachIndexed { index, value ->  
            if(value)
                answer += absolutes[index]
            else
                answer -= absolutes[index]
        }
        
        return answer
    }
}