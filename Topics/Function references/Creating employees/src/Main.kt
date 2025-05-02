class Employee(val id: Int, val name: String, val lastName: String, val telNum: String, val email: String) {

    fun printData() {
        println("Employee $id")
        println("full name: $name $lastName")
        println("tel. num: $telNum")
        println("email: $email")
    }
}

fun main() {
    val count = readln().toInt()

    createEmployees(::Employee, count)
}

fun createEmployees(employeeCreator: (Int, String, String, String, String) -> Employee, count: Int) {
    repeat(count) { index ->
        val (name, lastName, telNum, email) = readln().split(' ')
        val newEmployee = employeeCreator(index + 1, name, lastName, telNum, email)
        newEmployee.printData()
    }
}