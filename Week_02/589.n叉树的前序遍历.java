import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
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
    public List<Integer> preorder(Node root) {

        // Method 1: Recursion
        // TC O(n) SC O(h)
        // 2 ms	40.5 MB
        // List<Integer> ret = new ArrayList<>();
        // if (root == null) {
        //     return ret;
        // }
        // ret.add(root.val);
        // for (int i = 0; i < root.children.size(); i++) {
        //     ret.addAll(preorder(root.children.get(i)));
        // }
        // return ret;

        // Method 2: Iteration
        // TC O(n) SC O(h)
        // 3 ms	40.3 MB
        List<Integer> ret = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        if (root == null) {
            return ret;
        }
        s.push(root);
        while(!s.empty()) {
            Node tmp = s.pop();
            ret.add(tmp.val);
            for (int i = tmp.children.size() - 1; i >= 0; i--) {
                s.push(tmp.children.get(i));
            }
        }
        return ret;
        

    }
}
// @lc code=end

