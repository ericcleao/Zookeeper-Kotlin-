fun main() {
    val answer : Int = try { readLine()!!.toInt() } catch(e: NumberFormatException) { 0 }
        finally { println("The answer is a number") }   
    println(answer)
}
