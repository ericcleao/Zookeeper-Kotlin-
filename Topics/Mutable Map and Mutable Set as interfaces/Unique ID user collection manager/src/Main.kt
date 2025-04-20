data class User(private val id: Int, private val name: String) {
    override fun toString(): String {
        return "$id $name"
    }
}

fun main(args: Array<String>) {
    val set2: MutableSet<Int> = linkedSetOf(4, 5, 6)

    val map1 = mutableMapOf(1 to "apple", 2 to "banana")

    val set1: Set<Int> = mutableSetOf(1, 2, 3)

    val map3: MutableMap<Int, String> = mapOf(5 to "elderberry").toMutableMap()

    val map2: Map<Int, String> = hashMapOf(3 to "cherry", 4 to "date")

    val usersById = mutableMapOf<Int, User>()

    do {
        val input = readln()

        val inputList = input.split(" ")
        val command = inputList.getOrElse(0) { "end" }

        when (command) {
            "add" -> {
                val id = inputList.getOrNull(1)?.toIntOrNull()
                val userName =  inputList.getOrNull(2)
                if (id != null && userName != null) {
                    val userIdAlreadyExists = usersById.putIfAbsent(id, User(id, userName)) != null
                    if (userIdAlreadyExists) {
                        println("ID exists")
                    }
                } else {
                    println("Invalid \"add\" arguments")
                }
            }
            "remove" -> {
                val id = inputList.getOrNull(1)?.toIntOrNull()
                if (id != null) {
                    usersById.remove(id.toInt())
                } else {
                    println("Invalid \"remove\" arguments")
                }
            }
        }
    } while (command != "end")

    usersById.values.forEach(::println)
}