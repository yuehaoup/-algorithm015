/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        // TC O(n) SC O(1)
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[cur] == nums[i]) {
                continue;
            }
            nums[cur++] = nums[i];
        }
        return cur;
    }
}
// @lc code=end

