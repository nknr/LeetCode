fun main() {
    println("result: ${getFirstOccurrence("butcr", "sad")}")
}

private fun getFirstOccurrence(haystack: String, needle: String): Int {

    for (index in haystack.indices) {
        if (((haystack.length - 1) - index) < needle.length - 1) return -1
        if (haystack[index] == needle[0] && haystack.substring(index, (index + needle.length)) == needle) return index
    }
    return -1
}