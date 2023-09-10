fun main() {
    val digits = intArrayOf(1, 2)
    println("result: ${getPlusOne(digits).asList()}")
}

fun getPlusOne(digits: IntArray): IntArray {
    val size = digits.size
    for (i in size - 1 downTo 0) {
        val num = digits[i]
        digits[i] = if (num >= 9) 0 else num + 1
        if (num < 9) return digits
    }

    return digits.copyOf(size + 1).apply {
        this[1] = 0
        this[0] = 1
    }
}