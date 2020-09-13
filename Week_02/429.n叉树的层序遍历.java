import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new ArrayList<>();
        HashMap<Integer, List<Integer>> tmp = levelOrderDepth(root, 0);
        int i = 0;
        while (tmp.containsKey(i)) {
            ret.add(tmp.get(i));
            i++;
        }
        return ret;
    }

    private HashMap<Integer, List<Integer>> levelOrderDepth(Node root, int level) {

        // Method 1: Recursion
        // TC O(n) SC O(n)
        // 22 ms	40.6 MB
        HashMap<Integer, List<Integer>> ret = new HashMap<>();
        if (root == null) {
            return ret;
        }
        List<Integer> cur = new ArrayList<>();
        cur.add(root.val);
        ret.put(level, cur);
        for (int i = 0; i < root.children.size(); i++) {
            HashMap<Integer, List<Integer>> tmpSub = levelOrderDepth(root.children.get(i), level + 1);
            for (Integer l: tmpSub.keySet()) {
                List<Integer> curSub = ret.containsKey(l) ? ret.get(l): new ArrayList<>();
                curSub.addAll(tmpSub.get(l));
                ret.put(l, curSub);
            }
        }
        return ret;
    }
}
// @lc code=end

