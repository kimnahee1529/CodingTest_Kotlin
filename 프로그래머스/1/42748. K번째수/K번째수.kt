class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        commands.forEachIndexed { index, data ->
            val i = data[0]
            val j = data[1]
            val k = data[2]
            array.slice(i-1 until j).sorted()
            answer.add(array.slice(i-1 until j).sorted().get(k-1))
        }
        return answer.toIntArray()
    }
}
