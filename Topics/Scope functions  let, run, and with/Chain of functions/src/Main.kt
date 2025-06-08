data class Musician(var name: String = "", var band: String = "", var role: String = "")

fun main() {
    val musician = Musician()

    musician.apply {
        name = readln()
        band = readln()
        role = readln()
    }

    with(musician) {
        println(this)
        this.name.length
    }.let {
        println(it/4)
        it/4
    }.run {
        val num = this + 10
        println(num)
    }
}