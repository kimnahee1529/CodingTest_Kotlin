class Solution {
    fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"
}

// fun solution(seoul: Array<String>): String {
//          seoul.forEachIndexed { index, s -> 
//              if(s=="Kim")
//                 return "김서방은 ${index}에 있다"
//          }
//          return ""
//     }
