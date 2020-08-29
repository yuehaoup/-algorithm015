import java.util.List;

/*
 * @lc app=leetcode.cn id=641 lang=java
 *
 * [641] 设计循环双端队列
 */

// @lc code=start

class MyCircularDeque {

    class ListNode {
        public int val;
        public ListNode next;
        public ListNode prev;
    }

    private int size = 0;
    private int limit = 0;

    ListNode head = new ListNode();
    ListNode tail = new ListNode();

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.limit = k;
        this.head.next = this.tail;
        this.head.prev = null;
        this.tail.next = null;
        this.tail.prev = this.head;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        ListNode obj = new ListNode();
        ListNode tmp = this.head.next;
        obj.val = value;
        obj.next = tmp;
        obj.prev = this.head;
        this.head.next = obj;
        tmp.prev = obj;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        ListNode obj = new ListNode();
        ListNode tmp = this.tail.prev;
        obj.val = value;
        tmp.next = obj;
        this.tail.prev = obj;
        obj.prev = tmp;
        obj.next = this.tail;
        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }
        this.head.next.next.prev = this.head;
        this.head.next = this.head.next.next;
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        this.tail.prev.prev.next = this.tail;
        this.tail.prev = this.tail.prev.prev;
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return this.head.next.val;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return this.tail.prev.val;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return this.size == this.limit;
    }

    public static void main(String[] args) {
        MyCircularDeque obj = new MyCircularDeque(2);
        boolean param_1 = obj.insertFront(3);
        boolean param_2 = obj.insertLast(4);
        boolean param_3 = obj.deleteFront();
        boolean param_4 = obj.deleteLast();
        int param_5 = obj.getFront();
        int param_6 = obj.getRear();
        boolean param_7 = obj.isEmpty();
        boolean param_8 = obj.isFull();
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
// @lc code=end

