fun getShape(option: Int): String? = when(option) {
    1 -> "square"
    2 -> "circle"
    3 -> "triangle"
    4 -> "rhombus"
    else -> null
}

fun main(args: Array<String>) {
    // write your code here
    val option = readln().toInt()

    val selectedShape = getShape(option)

    println(
        if(selectedShape != null) "You have chosen a $selectedShape"
        else "There is no such shape!"
    )
}