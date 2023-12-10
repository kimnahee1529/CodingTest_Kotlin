class Solution {
    fun solution(n: Long): Long {
         var answer: Long = 0
        //숫자를 문자열로 바꾸고 Long형 리스트로 만든다음에 내림차순 정렬
        val sortedNumbers = n.toString().map{ it.toString().toLong()}.sortedDescending()
        //하나의 문자열로 결합한 후 Long 타입으로 변환
        answer = sortedNumbers.joinToString("").toLong()
        println(answer)
        return answer
    }
}