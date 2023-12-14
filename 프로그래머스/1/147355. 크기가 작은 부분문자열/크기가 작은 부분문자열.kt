class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
    val tLen = t.length-1
    val pLen = p.length-1
    for(i in 0..tLen-pLen){
        var num = t.slice(i..i+pLen)
        if(num.toLong() <= p.toLong()){
            answer++
        }
    }
    return answer
    }
}