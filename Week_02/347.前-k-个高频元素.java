import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

import com.apple.concurrent.Dispatch.Priority;

/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // TC O(n) SC O(n)
        // 17 ms	42.4 MB

        HashMap<Integer, Integer> m = new HashMap<>();

        int[] ret = new int[k];

        for (int i = 0; i < nums.length; i++) {
            int cur = m.containsKey(nums[i]) ? m.get(nums[i]): 0;
            cur++;
            m.put(nums[i], cur);
        }
        Comparator comparator = new Comparator<List<Integer>>(){
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1) - o1.get(1);
            }
        };
        PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>(comparator);
        for (Integer i: m.keySet()) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(i);
            tmp.add(m.get(i));
            pq.add(tmp);
        }
        for (int i = 0; i < k; i++) {
            List<Integer> tmp = pq.poll();
            ret[i] = tmp.get(0);
        }

        return ret;

    }
}
// @lc code=end

