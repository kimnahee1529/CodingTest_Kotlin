class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        val uppercase = listOf('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z')
        val lowercase = listOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
        
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