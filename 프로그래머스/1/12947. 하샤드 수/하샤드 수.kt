class Solution {
    fun solution(x: Int): Boolean {
        val xtoString = x.toString()
        val sum = xtoString.map{
            it.toString().toInt()
        }.sum()
        
        if(x % sum == 0) return true else return false
        
      
        // if(x % x.toString().map{it.toString().toInt()}.sum() == 0)
        //     return true
        // else
        //     return false
    }
}
//문자열로 바꾼다
//각 자리수를 더한다
//나눠지는지 확인한다