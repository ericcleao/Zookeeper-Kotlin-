fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    return purchases.toMutableMap().apply {
        for ((key, value) in addition) {
            merge(key, value, Int::plus)
        }
    }
}