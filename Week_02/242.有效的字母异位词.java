import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {

        // TC O(n) SC O(1)
        // 19 ms	40.7 MB
        HashMap<Character, Integer> k = new HashMap<Character, Integer>();
        char[] srcCharArr = s.toCharArray();
        for (int i = 0; i < srcCharArr.length; i++) {
            if (!k.containsKey(srcCharArr[i])) {
                k.put(srcCharArr[i], 1);
            } else {
                k.put(srcCharArr[i], k.get(srcCharArr[i]) + 1);
            }
        }
        char[] distCharArr = t.toCharArray();
        for (int i = 0; i < distCharArr.length; i++) {
            if (!k.containsKey(distCharArr[i])) {
                return false;
            }
            int tmp = k.get(distCharArr[i]);
            tmp--;
            if (tmp <= 0) {
                k.remove(distCharArr[i]);
            } else {
                k.put(distCharArr[i], tmp);
            }
        }
        if (k.size() != 0) {
            return false;
        }
        return true;
    }
}
// @lc code=end

