import kotlin.math.abs

fun main() {
    val (x1, y1) = readln().trim().split(" ").map { it.toInt() }
    val (x2, y2) = readln().trim().split(" ").map { it.toInt() }

    val diffX = abs(x1 - x2)
    val diffY = abs(y1 - y2)

    println(if (diffX == 2 && diffY == 1 || diffX == 1 && diffY == 2) "YES" else "NO")
}