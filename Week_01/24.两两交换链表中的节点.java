/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {

        // Method 1: Recursion  
        // TC O(n) SC O(n)
        // 0 ms	37.3 MB
        // if (head == null || head.next == null) {
        //     return head;
        // }
        // ListNode n1 = head;
        // ListNode n2 = head.next;
        // n1.next = swapPairs(n2.next);
        // n2.next = n1;
        // return n2;

        // Method 2: Iteration
        // TC O(n) SC O(1)
        // 0 ms	37.2 MB
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ret = head.next;
        ListNode n1 = head;
        ListNode n2 = head.next;
        while (n1 != null && n2 != null) {
            ListNode tmp = n2.next;
            ListNode next = null;
            if (tmp != null && tmp.next != null) {
                next = n2.next.next;
            } else if (tmp != null && tmp.next == null) {
                next = n2.next;
            }
            n2.next = n1;
            n1.next = next;
            if (tmp != null && tmp.next != null) {
                n1 = tmp;
                n2 = tmp.next;
            } else {
                n1 = null;
            }
        }
        return ret;
    }
}
// @lc code=end

