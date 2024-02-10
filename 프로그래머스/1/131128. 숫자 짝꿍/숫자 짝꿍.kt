class Solution {
    fun solution(X: String, Y: String): String {
        val xCounts = X.groupingBy { it }.eachCount().toMutableMap()
        val yCounts = Y.groupingBy { it }.eachCount()
    
        println("x: $xCounts")
        println("y: $yCounts")
        val commonElements = mutableListOf<Char>()
    
        yCounts.forEach { (char, count) ->
            val minCount = xCounts[char]?.let { minOf(it, count) } ?: 0
            repeat(minCount) {
                commonElements.add(char)
            }
        }
        
        if (commonElements.isEmpty()) return "-1"
    
        val result = commonElements.sortedDescending().joinToString("")
    
        return if (result.all { it == '0' }) "0" else result
    }

}
