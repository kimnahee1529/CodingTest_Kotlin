class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        answer = a.zip(b).sumOf {
            it.first * it.second
        }
        return answer
    }
}
// val length = a.size
// for(i in 0..length-1){
//     answer += a[i] * b[i]
// }


