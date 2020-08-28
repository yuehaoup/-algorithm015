/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Method 1: Violent Loop 3
        // TC O(n^3) SC O(2^n)
        // Usage: exceed
        // HashSet<List<Integer>> set = new HashSet<>();
        // for (int i = 0; i < nums.length - 2; i++) {
        //     for (int j = i + 1; j < nums.length - 1; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (nums[i] + nums[j] + nums[k] != 0) {
        //                 continue;
        //             }
        //             List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
        //             Collections.sort(tmp);
        //             set.add(tmp);
        //         }
        //     }
        // }
        // return new ArrayList<>(set);

        // Method 2: Double Set
        // TC O(n^2) SC O(2^n)
        // 1279 ms	45 MB
        // HashSet<List<Integer>> set = new HashSet<>();
        // HashMap<Integer, Integer> res = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     res.put(-1 * nums[i], i);
        // }
        // for (int i = 0; i < nums.length - 2; i++) {
        //     for (int j = i + 1; j < nums.length - 1; j++) {
        //         int tmp = nums[i] + nums[j];
        //         if (!res.containsKey(tmp)) {
        //             continue;
        //         }
        //         if (res.get(tmp) <= j) {
        //             continue;
        //         }
        //         List<Integer> item = Arrays.asList(nums[i], nums[j], -1 * tmp);
        //         Collections.sort(item);
        //         set.add(item);
        //     }
        // }
        // return new ArrayList<>(set);

        // Method 3: Double Pointer
        // TC O(n^2) SC O(2^n)
        // 31 ms	43.8 MB
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            HashSet<List<Integer>> set = new HashSet<>();
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] > 0) {
                    break;
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int tmp = nums[left] + nums[right] + nums[i];
                    if (tmp == 0) {
                        set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[right] == nums[--right]);
                        while (left < right && nums[left] == nums[++left]);
                    } else if (tmp > 0) {
                        while (left < right && nums[right] == nums[--right]);
                    } else {
                        while (left < right && nums[left] == nums[++left]);
                    }
                }
            }
            return new ArrayList<>(set);
    }
}
// @lc code=end

