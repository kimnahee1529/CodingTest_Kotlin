class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if((s.length == 4 || s.length == 6))
            try{
                s.toInt()
                return true
            }catch(e:NumberFormatException){
            }
        return false
    }
}