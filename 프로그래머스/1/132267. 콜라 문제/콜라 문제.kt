class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var emptyBottle = n
    
        while (emptyBottle / a != 0) {
            val newBottle = emptyBottle / a * b
            emptyBottle = newBottle + emptyBottle % a
    
            answer += newBottle
        }
        println(answer)
    
        return answer
    }
}