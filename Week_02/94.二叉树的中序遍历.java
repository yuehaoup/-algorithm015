import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        // Method 1: Recursion
        // TC O(n) SC O(h)
        // List<Integer> ret = new ArrayList<>();
        // if (root == null) {
        //     return ret;
        // }
        // ret.addAll(inorderTraversal(root.left));
        // ret.add(root.val);
        // ret.addAll(inorderTraversal(root.right));
        // return ret;

        // Method 2: Iteration
        // TC O(n) SC O(h)
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (!s.empty() || cur != null) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            TreeNode tmp = s.pop();
            ret.add(tmp.val);
            cur = tmp.right;
        }
        return ret;

    }
}
// @lc code=end

