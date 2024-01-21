class Solution {
    fun solution(s: String): Boolean {
        if((s.length == 4 || s.length == 6) && s.toIntOrNull() != null)
            return true            
        return false
    }
}
//        try{
//            s.toInt()
//            return true
//        }catch(e:NumberFormatException){
//        }
