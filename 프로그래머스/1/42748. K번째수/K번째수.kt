class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        commands.forEach {data ->
            answer.add(array.slice(data[0]-1 until data[1]).sorted().get(data[2]-1))
        }
        return answer.toIntArray()
    }
}

// val answer = commands.map{data->
//     array.slice(data[0]-1 until data[1]).sorted().get(data[2]-1)
// }
