fun isFibonacci(n: Int): Boolean {
    val questionCap = 55
    val fibonacciNumbers = mutableListOf(0, 1 , 2)

    if (fibonacciNumbers.contains(n)) {
        return true
    }

    do {
        val secondLast = fibonacciNumbers[fibonacciNumbers.size - 2]
        val last = fibonacciNumbers.last()

        val nextFibonacciNumber = secondLast + last

        if (nextFibonacciNumber == n) {
            return true
        }
        fibonacciNumbers.add(nextFibonacciNumber)
    } while (nextFibonacciNumber < n && nextFibonacciNumber < questionCap)

    return false
}

fun isTriangle(n: Int): Boolean {
    val questionCap = 45
    var currentTriangleNumber = 0

    var i = 1
    while (currentTriangleNumber <= n && currentTriangleNumber <= questionCap) {
        if(n == currentTriangleNumber) {
            return true
        }
        currentTriangleNumber += i
        i++
    }

    return false
}

fun isPower(n: Int): Boolean {
    val questionCap = 100000
    val base = 10
    var currentPowerNumber = 1

    while (currentPowerNumber <= n && currentPowerNumber <= questionCap) {
        if(n == currentPowerNumber) {
            return true
        }
        currentPowerNumber *= base
    }

    return false
}

fun main() {
    val input = readln().toInt()

    when {
        isFibonacci(input) -> println('F')
        isTriangle(input) -> println('T')
        isPower(input) -> println('P')
        else -> println('N')
    }
}