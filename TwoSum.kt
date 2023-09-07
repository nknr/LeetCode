/**
 * https://leetcode.com/problems/two-sum/
 */
fun main() {
    val nums = intArrayOf(1,2,3,4)
    val target = 3
    for(i in 0..nums.size-2) {
        for(j in (i+1)..nums.size-1){
            if(nums[i] + nums[j] == target){
                System.out.print("result: [$i,$j]")
                return
            }
            
        }
    }
}