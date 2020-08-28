/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // TC O(n) SC O(n)
        // 3 ms	39.8 MB
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (!map.containsKey(tmp)) {
                continue;
            }
            if (map.get(tmp) > i) {
                return new int[]{i, map.get(tmp)};
            }
        }
        return new int[]{};
    }
}
// @lc code=end

