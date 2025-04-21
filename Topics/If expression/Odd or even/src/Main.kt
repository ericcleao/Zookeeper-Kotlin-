fun main() {
    // write your code here
    val input = readln().toInt()

    val result = when {
        input % 2 == 0 -> "EVEN"
        else -> "ODD"
    }

    println(result)
}