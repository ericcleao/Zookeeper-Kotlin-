fun main() {
    val input = readln()

    for (character in input) {
        if (character in '0'..'9') {
            println(character)
            return
        }
    }
}