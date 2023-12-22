class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        //2016년은 윤년
        val date = listOf("FRI","SAT","SUN","MON","TUE","WED","THU")
        val sumMonth = listOf(0,31,60,91,121,152,182,213,244,274,305,335,366)

        answer = date[(sumMonth[a-1]+(b-1))%7]
        return answer
    }
}