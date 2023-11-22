class Solution {
    fun solution(n: Int): Int =  (0..n step 2).sum()
        //1.
        // (2..n).filter{ it % 2 == 0}.sum()
    
        //2.내가 한 거
        // for(i: Int in 2..n step(2))
        //      answer += i    
     
}