/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {

        // TC O(n) SC O(n)
        // 2 ms	38 MB
        Stack<Character> st = new Stack<>();
        char[] sc = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (int i = 0; i < sc.length; i++) {
            Character tmp = sc[i];
            if (map.containsKey(tmp)) {
                st.push(tmp);
                continue;
            }
            if (st.empty()) {
                return false;
            }
            if (map.get(st.pop()) != tmp) {
                return false;
            }
        }
        return st.empty();
    }
}
// @lc code=end

