class Solution {
    fun solution(angle: Int) = when {
            (angle in 0 .. 89) -> 1
            (angle  == 90) -> 2
            (angle in 91 .. 179) -> 3
            else -> 4
    }
}