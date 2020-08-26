/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        // Method 1: Double Loop
        // TC O(n^2) SC O(1)
        // 390 ms	40.1 MB
        // int max = 0;
        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i + 1; j< height.length; j++) {
        //         int tmp = Math.min(height[i], height[j]) * (j - i)
        //         if (tmp > max) {
        //             max = tmp;
        //         }
        //     }
        // }
        // return max;

        // Method 2: Double Pointer
        // TC O(n) SC O(1)
        // 3 ms	40 MB
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int tmp = Math.min(height[left], height[right]) * (right - left);
            if (tmp > max) {
                max = tmp;
            }
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;

    }
}
// @lc code=end

