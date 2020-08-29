import java.util.Stack;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        // Method 1: Double Stack
        // TC O(n) SC O(n)
        // 1 ms	38.6 MB
        // Stack<Integer> st = new Stack<>();
        // Stack<Integer> ret = new Stack<>();
        // for (int i = 0; i < digits.length; i++) {
        //     st.push(digits[i]);
        // }
        // int incr = 1;
        // while (!st.empty()) {
        //     int tmp = st.pop() + incr;
        //     incr = tmp / 10;
        //     ret.push(tmp % 10);
        // }
        // if (incr == 1) {
        //     ret.push(1);
        // }
        // int[] retA = new int[ret.size()];
        // for (int i = 0; i < retA.length; i++) {
        //     retA[i] = ret.pop();
        // }
        // return retA;

        // Method 2: Loop
        // TC O(n) SC O(1)
        // 0 ms	38.4 MB
        int[] ret = new int[digits.length + 1];
        int incr = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int tmp = digits[i] + incr;
            ret[i + 1] = tmp % 10;
            incr = tmp / 10;
        }
        if (incr == 1) {
            ret[0] = 1;
            return ret;
        } else {
            System.arraycopy(ret, 1, digits, 0, digits.length);
            return digits;
        }
        
    }
}
// @lc code=end

