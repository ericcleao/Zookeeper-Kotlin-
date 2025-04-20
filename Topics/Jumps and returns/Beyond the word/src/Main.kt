fun main() {
    val word = readln()

    for (letter in 'a'..'z') {
        if (word.contains(letter)) continue
        print(letter)
    }
    println()
}