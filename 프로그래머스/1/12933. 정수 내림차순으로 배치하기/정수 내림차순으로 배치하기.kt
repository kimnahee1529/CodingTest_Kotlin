class Solution {
    fun solution(n: Long): Long = n.toString().toCharArray().sortedArrayDescending().joinToString("").toLong()
}

// println(n.toString())
        // println(n.toString().toCharArray())
        // println(n.toString().toCharArray().sortedArray()) //오름차순 정렬
        // println(n.toString().toCharArray().sortedArrayDescending().joinToString("").toLong()) //내림차순 정렬