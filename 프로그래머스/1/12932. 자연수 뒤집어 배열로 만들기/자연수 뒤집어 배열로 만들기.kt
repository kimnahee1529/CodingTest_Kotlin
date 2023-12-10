class Solution {
    fun solution(n: Long): IntArray { 
        return n.toString().map{it.toString().toInt()}.reversed().toIntArray()
    }
}