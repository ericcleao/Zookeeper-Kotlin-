fun main() {
    val sum = generateSequence { readln().toInt() }
        .takeWhile { it != 0 }
        .sum()
    println(sum)
}