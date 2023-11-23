class Solution {
    fun solution(n: Int): Int {
        var N = n
        var answer = 0

        for(i: Int in 1..n.toString().length){
            answer += N%10 
            N = N/10
        }
        return answer
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
        