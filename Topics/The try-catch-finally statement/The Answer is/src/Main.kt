fun main() {
    val answer: Int = try {
        readln().toInt()
    } catch (_: NumberFormatException) {
        42
    } finally {
        println("The answer is a number")
    }
    println(answer)
}
