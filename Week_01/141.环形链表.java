/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // TC O(n) SC O(1)
        // 0 ms	39.7 MB
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            slow = slow.next;
            if (slow == null) {
                return false;
            }
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            if (slow == fast) {
                break;
            }
        }
        return true;
    }
}
// @lc code=end

