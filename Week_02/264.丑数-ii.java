import java.util.HashSet;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=264 lang=java
 *
 * [264] 丑数 II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {

        // TC O(n) SC O(n)
        // 77 ms	39.5 MB
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> s = new HashSet<>();
        pq.add(1L);
        long i = 1;
        while (i < n) {
            Long tmp = pq.poll();
            Long t = 0L;
            t = tmp * 2;
            if (!s.contains(t)) {
                pq.add(t);
                s.add(t);
            }
            t = tmp * 3;
            if (!s.contains(t)) {
                pq.add(t);
                s.add(t);
            }
            t = tmp * 5;
            if (!s.contains(t)) {
                pq.add(t);
                s.add(t);
            }
            i++;
        }
        return pq.poll().intValue();
    }
}
// @lc code=end

