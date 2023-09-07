/**
 * https://leetcode.com/problems/roman-to-integer/
 */
fun main() {
    val s = "III"
    var sum = 0
    var lastRomanInt = 0
    for(i in s.indices) {
        var currentRomonInt = when(s[i]) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
        if(lastRomanInt != 0 && lastRomanInt < currentRomonInt) {
            sum -= lastRomanInt
            currentRomonInt -= lastRomanInt
        }
        sum += currentRomonInt
        lastRomanInt = currentRomonInt
    }
    println("result $sum")
}