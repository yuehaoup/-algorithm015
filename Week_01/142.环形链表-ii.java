/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
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

    private ListNode hasCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            slow = slow.next;
            if (slow == null) {
                return null;
            }
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            if (slow == fast) {
                break;
            }
        }
        return slow;
    }
    
    public ListNode detectCycle(ListNode head) {
        // Method 1 : Set
        // TC O(n) SC O(n)
        // 5 ms	40.8 MB
        // Set<ListNode> set = new HashSet<ListNode>();
        // ListNode cur = head;
        // while (true) {
        //     if (cur.next == null) {
        //         return null;
        //     }
        //     if (set.contains(cur)) {
        //         return cur;
        //     }
        //     set.add(cur);
        //     cur = cur.next;
        // }

        // Method 2: Floyd
        // TC O(n) SC O(1)
        // 0 ms	40.1 MB

        public ListNode detectCycle(ListNode head) {
            ListNode fast = hasCycle(head);
            if (fast == null) {
                return null;
            }
            ListNode cur = head;
            while (cur != fast) {
                cur = cur.next;
                fast = fast.next;
            }
            return cur;
        }
    }
}
// @lc code=end

