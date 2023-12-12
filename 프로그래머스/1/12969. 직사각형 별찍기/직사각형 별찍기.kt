fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ')
        val aInt = a.toIntOrNull()!!
        val bInt = b.toIntOrNull()!!

        for(i in 1..bInt){
            for(j in 1..aInt){
                print("*")
            }
            println()
        }
}