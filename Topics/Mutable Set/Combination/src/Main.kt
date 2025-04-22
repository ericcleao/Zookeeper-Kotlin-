fun solution(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val result = setSource.toMutableSet()
    result.addAll(listSource)
    return result
}