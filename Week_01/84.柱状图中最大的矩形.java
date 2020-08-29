import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {

        // Method 1: Violent
        // SC O(n^2) TC O(1)
        // 925 ms	41.6 MB
        // int max = 0;
        // for (int i = 0; i < heights.length; i++) {
        //     int min = heights[i];
        //     for (int j = i; j < heights.length; j++) {
        //         min = Math.min(min, heights[j]);
        //         max = Math.max(max, (j - i + 1) * min);
        //     }
        // }
        // return max;

        // Method 2: Stack
        // SC O(n) TC O(n)
        // 12 ms	41 MB
        int[] arr = new int[heights.length  +2];
        System.arraycopy(heights, 0, arr, 1, heights.length);
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] > arr[i]) {
                int pos = st.pop();
                int maxHeight = arr[pos];
                int maxWidth = i - st.peek() - 1;
                max = Math.max(max, maxHeight * maxWidth);
            }
            st.push(i);
        }
        return max;

    }
}
// @lc code=end

