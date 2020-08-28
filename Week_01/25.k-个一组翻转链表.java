/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        // Method 1: Recursion
        // TC O(n) SC O(1)
        // 0 ms	40.3 MB
        int i;
        ListNode prev = null;
        ListNode cur;
        cur = head;
        i = 0;
        while (i++ < k) {
            if (cur == null) {
                return head;
            }
            cur = cur.next;
        }
        cur = head;
        i = 0;
        while (i++ < k) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        head.next = reverseKGroup(cur, k);
        return cur.next;
    }
}
// @lc code=end

