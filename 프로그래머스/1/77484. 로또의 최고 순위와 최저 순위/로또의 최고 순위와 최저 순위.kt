class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): MutableList<Int> {
        val result = mutableListOf<Int>()
        var num1 = 0
        var num2 = 0
        win_nums.forEachIndexed { index, i ->
            if(lottos.contains(i))
                num1++
        }
        num2 = lottos.count {
            it==0
        }
        result.add(calculateRank(num1+num2))
        result.add(calculateRank(num1))
        println("result: $result")
        return result
    }
}

fun calculateRank(lotto: Int): Int{
    when(lotto){
        6-> return 1
        5-> return 2
        4-> return 3
        3-> return 4
        2-> return 5
        else -> return 6
    }
}