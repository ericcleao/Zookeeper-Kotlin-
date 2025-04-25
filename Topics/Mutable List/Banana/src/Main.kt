fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    return strings
        .map { if (it == str) "Banana" else it }
        .toMutableList()
}