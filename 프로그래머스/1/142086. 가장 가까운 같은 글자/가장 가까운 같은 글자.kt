class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf(-1)
        for(i in 1 until s.length){
            for(j in i-1 downTo 0 step 1){
                if(s[i]==s[j]){
                    answer.add(i-j)
                    break
                }
            }
            if(answer.size-1!=i){
                answer.add(-1)
            }
        }
    return answer.toIntArray()
    }
}
