class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var a = score.sortedArrayDescending()

        for(i in 0 until score.size/m){
            var b = a.slice(i*m..(i+1)*m-1)
            answer += (b.last().toInt()) * m
        }
        return answer
    }
}