class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().map { it.toString().toInt() }.sum()
        if(x % sum == 0)
            return true
        else
            return false
    }
}