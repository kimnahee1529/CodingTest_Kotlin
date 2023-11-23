class Solution {
    fun solution(n: Int): Int {
        return n.toString().map {it.toString().toInt()}.sum()
    }
}


//문자열로 만들기
//하나하나 쪼개서 배열로 만들기
//.sum함수로 다 더하기


// val strSize = (n.toString()).length
// val array = (n.toString()).split("").slice(1..strSize)
// println(array)
// val ints = array.map { it.toInt() }.toTypedArray()
// println(ints)
// print(array.slice(1..strSize))
        