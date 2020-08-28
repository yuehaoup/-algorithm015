/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {

    public int climbStairs(int n) {

        // Method 1 Recursion: Fibonacci f(n) = f(n - 1) + f(n - 2)
        // TC O(2^n) SC O(n)
        // Usage: exceed
        // if (n <= 2) {
        //     return n;
        // }
        // return climbStairs(n - 1) + climbStairs(n - 2)

        // Method 2 Recursion Optimized1: Fibonacci f(n) = f(n - 1) + f(n - 2)
        // TC O(n) SC O(n)
        // 0 ms	36.5 MB
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(1, 1);
        // map.put(2, 2);
        // for (int i = 3; i <= n; i++) {
        //     map.put(i, map.get(i - 1) + map.get(i - 2));
        // }
        // return map.get(n);

        // Method 2 Recursion Optimized2: Fibonacci f(n) = f(n - 1) + f(n - 2)
        // TC O(n) SC O(1)
        // 0 ms	36.5 MB
        if (n <= 2) {
            return n;
        }
        int n_1 = 1;
        int n_2 = 2;
        for (int i = 3; i < n; i++) {
            int tmp = n_2;
            n_2 = tmp + n_1;
            n_1 = tmp;
        }
        return n_1 + n_2;
    }

}
// @lc code=end

