import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // TC O(n) SC O(n)
        // 77 ms	46.8 MB

        HashMap<HashMap<Character, Integer>, List<String>> all = new HashMap<HashMap<Character, Integer>, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> t = new HashMap<Character, Integer>();
            char[] arr = strs[i].toCharArray();
            for (int j = 0; j < arr.length; j++) {
                char tc = arr[j];
                if (!t.containsKey(tc)) {
                    t.put(tc, 1);
                } else {
                    t.put(tc, t.get(tc) + 1);
                }
            }
            if (all.containsKey(t)) {
                all.get(t).add(strs[i]);
            } else {
                List<String> cr = new ArrayList<>();
                cr.add(strs[i]);
                all.put(t, cr);
            }
        }
        List<List<String>> ret = new ArrayList<>();
        for (List<String> ins: all.values()) {
            ret.add(ins);
        }
        return ret;
    }
}
// @lc code=end

