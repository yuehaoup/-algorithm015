import java.util.List;

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // Method 1 Loop
        // TC O(n) SC O(1)
        // 1 ms	39.6 MB
        // ListNode head = new ListNode(-1);
        // ListNode cur = head;
        // while (l1 != null && l2 != null) {
        //     if (l1.val < l2.val) {
        //         cur.next = l1;
        //         l1 = l1.next;
        //     } else {
        //         cur.next = l2;
        //         l2 = l2.next;
        //     }
        //     cur = cur.next;
        // }
        // if (l1 == null) {
        //     cur.next = l2;
        // } else {
        //     cur.next = l1;
        // }
        // return head.next;

        // Method 2: Recursion
        // TC O(n) SC O(1)
        // 1 ms	39.8 MB
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(-1);
        if (l1.val < l2.val) {
            head.next = l1;
            l1.next = mergeTwoLists(l1.next, l2);
        } else {
            head.next = l2;
            l2.next = mergeTwoLists(l2.next, l1);
        }
        return head.next;
        

    }
}
// @lc code=end

