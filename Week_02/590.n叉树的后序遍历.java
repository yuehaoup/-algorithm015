import java.util.Stack;

import javax.swing.tree.TreeNode;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N叉树的后序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {

        // Method 1: Recursion
        // TC O(n) SC O(h)
        // 2 ms	40.5 MB
        // List<Integer> ret = new ArrayList<>();
        // if (root == null) {
        //     return ret;
        // }
        // for (int i = 0; i < root.children.size(); i++) {
        //     ret.addAll(postorder(root.children.get(i)));
        // }
        // ret.add(root.val);
        // return ret;

        // Method 2: Iteration
        // TC O(n) SC O(h)
        // 8 ms	40.1 MB
        List<Integer> ret = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        if (root == null) {
            return ret;
        } 
        s1.add(root);
        while (!s1.empty()) {
            Node tmp = s1.pop();
            s2.push(tmp);
            for (int i = 0; i < tmp.children.size(); i++) {
                if (tmp.children.get(i) != null) {
                    s1.push(tmp.children.get(i));
                }
            }
        }
        while (!s2.empty()) {
            Node tmp = s2.pop();
            ret.add(tmp.val);
        }
        return ret;
    }
}
// @lc code=end

