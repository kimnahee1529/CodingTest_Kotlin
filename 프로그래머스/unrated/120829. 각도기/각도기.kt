class Solution {
    fun solution(angle: Int) = when {
        (angle in 0 .. 89) -> 1
        (angle  == 90) -> 2
        (angle in 91 .. 179) -> 3
        else -> 4
    }
    // fun solution(angle: Int): Int{
    //     var answer: Int = 0
    //     when(angle) {
    //         in 0 .. 89 -> answer = 1
    //         90 -> answer = 2
    //         in 91 .. 179 -> answer = 3
    //         180 -> answer = 4
    //     }
    //     return answer
    // }
}