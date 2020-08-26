/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        // Method 1: Fill Zero
        // TC O(n) SC O(1)
        // 0 ms	40.5 MB
        // int pos = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         nums[pos] = nums[i];
        //         pos++;
        //     }
        // }
        // for (int i = pos; i < nums.length; i++) {
        //     nums[i] = 0;
        // }

        // Method 2: Double Pointer
        // TC O(n) SC O(1)
        // 0 ms	40.5 MB
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = tmp;
                pos++;
            }
        }
    }
}
// @lc code=end

