class Solution {
    fun solution(arr: IntArray): IntArray = 
    if(arr.size == 1) arrayOf(-1).toIntArray() 
    else arr.filter { it != arr.minOrNull() }.toIntArray()
}