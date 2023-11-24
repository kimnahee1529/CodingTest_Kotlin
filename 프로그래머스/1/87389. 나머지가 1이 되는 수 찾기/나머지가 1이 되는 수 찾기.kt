class Solution {
    fun solution(n: Int) = (1..n).first { n % it == 1 }
    // fun solution(n: Int): Int {
    //     var answer: Int = 0
    //     for (i in 1..n){
    //         if(n%i == 1){
    //             answer = i
    //             break
    //         }
    //     }
    //     return answer
    // }
}