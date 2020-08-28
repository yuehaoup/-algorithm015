/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        // Method 1: Iteration
        // TC O(n) SC O(1)
        // 0 ms	39.9 MB
        // ListNode prev = null;
        // ListNode cur = head;
        // while (cur != null) {
        //     ListNode tmp = cur.next;
        //     cur.next = prev;
        //     prev = cur;
        //     cur = tmp;
        // }
        // return prev;

        // Method 2: Recursion
        // TC O(n) SC O(n)
        // 0 ms	40 MB
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return next;

    }
}
// @lc code=end

