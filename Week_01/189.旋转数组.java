/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }
    }

    public void rotate(int[] nums, int k) {
        // Method 1: Loop
        // TC O(nk) SC O(1)
        // 265 ms	40.5 MB
        // for (int i = 0; i < k; i++) {
        //     int last = nums[nums.length - 1];
        //     for (int j = nums.length - 1; j > 0; j--) {
        //         nums[j] = nums[j - 1];
        //     }
        //     nums[0] = last;
        // }
        // Method 2: Reverse
        // TC O(n) SC O(1)
        // 0 ms	40.1 MB
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}
// @lc code=end

