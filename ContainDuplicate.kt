/**
 *
 */

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(1, 1)
    val target = 3
    println(getDuplicate(nums, target))
}

fun getDuplicate(nums: IntArray, target: Int): Boolean {
    val map = HashMap<Int, Int>() // value, index
    for ((index, value) in nums.withIndex()) {
        if (map.containsKey(value) && abs(map.getOrDefault(value, 0) - index) <= target) {
            return true
        }
        map[value] = index
    }
    return false
}
