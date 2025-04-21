fun main() {
    val sequenceLength = readln().toInt()
    val positiveNumberCount = (1..sequenceLength).count { readln().toInt() > 0 }

    println(positiveNumberCount)
}