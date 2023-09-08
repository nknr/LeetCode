fun main() {
    println("result: ${getPosition(intArrayOf(1, 3, 5, 6), 5)}")
}

fun getPosition(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1
    while (low <= high) {
        val mid = (high + low) / 2
        if (nums[mid] == target) {
            return mid
        } else if (target > nums[mid]) {
            low = mid + 1
        } else if (target < nums[mid]) {
            high = mid - 1
        }
    }
    return low
}