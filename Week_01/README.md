# Week 1

## Array

| ACT | TC |
| --- | --- |
| prepend | O(1) |
| append | O(1) |
| lookup | `O(1)` |
| insert | `O(n)` |
| delete | `O(n)` |

## LinkedList

| ACT | TC |
| --- | --- |
| prepend | O(1) |
| append | O(1) |
| lookup | `O(n)` |
| insert | O(1) |
| delete | O(1) |

### 插入元素
```java
ListNode tmp = cur.next;
cur.next = obj;
obj.next = tmp;
```

## SkipList

只适用于元素有序
SC O(n)

| ACT | TC |
| --- | --- |
| lookup | `O(logn)` |
| insert | `O(logn)` |
| delete | `O(logn)` |

## Stack

单调栈应用：
- [柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/)
- [接雨水](https://leetcode-cn.com/problems/trapping-rain-water/)

## Queue

双向队列，维持单调性：
- [滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/)
