class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        for(i in 0..t.length-p.length){
            var num = t.slice(i..i+p.length-1)
            if(num.toLong() <= p.toLong()){
                answer++
            }
        }
    return answer
    }
}