fun main() {
    var currentNumber = 1
    var currentSequence = 0

    val numberOfRepetitions = readln().toInt()

    repeat(numberOfRepetitions) {
        print("$currentNumber ")

        if (currentNumber == ++currentSequence) {
            currentNumber++
            currentSequence = 0
        }
    }
}