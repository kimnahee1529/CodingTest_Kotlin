class Solution {
    fun solution(x: Int): Boolean {
        if(x % x.toString().map{it.toString().toInt()}.sum() == 0)
            return true
        else
            return false
    }
}