class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        val uppercase = ('A'..'Z').toList()
        val lowercase = ('a'..'z').toList()

        val result = s.map {
            if(it.isUpperCase()){
                println(uppercase.indexOf(it)+n)
                uppercase[(uppercase.indexOf(it) + n) % uppercase.size]
            }else if(it.isLowerCase()){
                println(lowercase.indexOf(it)+n)
                lowercase[(lowercase.indexOf(it) + n) % lowercase.size]
            }else{
                it
            }
        }
        answer = result.joinToString("")

        return answer
    }
}