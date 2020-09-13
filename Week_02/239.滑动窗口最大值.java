import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution2 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Method 1: Violent
        // TC O(nk) SC(n)
        // Usage: exceed
        // int[] ret = new int[nums.length - k + 1];
        // Queue<Integer> queue = new LinkedList<>();
        // Integer[] tmp = new Integer[k];
        // for (int i = 0; i < nums.length; i++) {
        //     queue.add(nums[i]);
        //     if (queue.size() < k) {
        //         continue;
        //     }
        //     if (queue.size() > k) {
        //         queue.poll();
        //     }
        //     queue.toArray(tmp);
        //     int max = tmp[0];
        //     for (int j = 1; j < k; j++) {
        //         max = Math.max(max, tmp[j]);
        //     }
        //     ret[i - k + 1] = max;
        // }
        // return ret;

        // Method 2: DQ
        // TC O(n) SC O(n)
        // 18 ms	48.9 MB
        // int[] ret = new int[nums.length - k + 1];
        // ArrayDeque<Integer> queue = new ArrayDeque<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (queue.isEmpty() || nums[queue.peekFirst()] < nums[i]) {
        //         queue.clear();
        //     }
        //     while (nums[queue.peekLast()] < nums[i]) {
        //         queue.pollLast();
        //     }
        //     queue.addLast(i);
        //     if (queue.peekFirst() <= i - k) {
        //         queue.pollFirst();
        //     }
        //     if (i - k + 1 >= 0) {
        //         ret[i - k + 1] = nums[queue.peekFirst()];
        //     }
        // }
        // return ret;

        // Method 3: PQ
        // TC O(nlogk) SC O(k)
        // Usage: exceed
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> (o2-o1));
        int[] ret = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                pq.remove(nums[i - k]);
            }
            pq.add(nums[i]);
            if (pq.size() == k) {
                ret[i - k + 1] = pq.peek();
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution2 ins = new Solution2();
        ins.maxSlidingWindow(new int[]{1, -1}, 1);
    }
}
// @lc code=end

