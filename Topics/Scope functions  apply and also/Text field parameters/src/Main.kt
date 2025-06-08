data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)

fun main() {
    val textField = TextField()

    textField.apply {
        println("Old settings: $this")
        text = readln()
        println("New settings: $this")
    }
}