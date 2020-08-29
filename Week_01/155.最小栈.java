import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {


    // 7 ms	41.9 MB
    private Stack<Integer> stData;
    private Stack<Integer> stMin;

    /** initialize your data structure here. */
    public MinStack() {
        stData = new Stack<>();
        stMin = new Stack<>();
    }
    
    public void push(int x) {
        stData.push(x);
        if (stMin.empty() || x < stMin.peek()) {
            stMin.push(x);
        }
    }
    
    public void pop() {
        if (stData.empty()) {
            return;
        }
        int tmp = stData.pop();
        if (tmp == stMin.peek()) {
            stMin.pop();
        }
    }
    
    public int top() {
        if (stData.empty()) {
            throw new RuntimeException("error");
        }
        return stData.peek();
    }
    
    public int getMin() {
        if (!stMin.empty()) {
            return stMin.peek();
        }
        throw new RuntimeException("error");
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

