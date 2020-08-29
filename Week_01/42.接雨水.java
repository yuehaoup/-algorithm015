import java.util.ArrayDeque;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution3 {
    public int trap(int[] height) {

        // TC O(n) SC O(n)
        // 4 ms	39.7 MB
        Stack<Integer> st = new Stack<>();
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            if (st.empty()) {
                st.push(i);
            } else if (height[st.peek()] > height[i]) {
                st.push(i);
            } else {
                while (!st.empty() && height[st.peek()] < height[i]) {
                    int bottomPos = st.pop();
                    if (!st.empty()) {
                        int bottom = height[bottomPos];
                        int delta = Math.min(height[st.peek()], height[i]) - bottom;
                        total += delta * (i - st.peek() -1);
                    }
                }
                st.push(i);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Solution3 a = new Solution3();
        a.trap(new int[]{2,1,0,2});
    }
}
// @lc code=end

