class Solution {
    fun solution(x: Int): Boolean {
        val x1 = x.toString()
        val map1 = x1.map {
            it.toString().toInt()
        }.sum()
        if(x % map1 == 0){
            return true
        }else
            return false
        
        // if(x % x.toString().map{it.toString().toInt()}.sum() == 0)
        //     return true
        // else
        //     return false
    }
}