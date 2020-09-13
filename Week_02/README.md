# Week 2

## Map / Set

- HashSet 基于 HashMap实现
- hash函数重要性

## 二叉树

### 遍历定义 O（n）
- 前序遍历：根左右
- 中序遍历：左根右
- 后序遍历：左右根

### 遍历实现
- 递归：easy
- 迭代：手动构造栈
    - 前序：注意right先压栈
    - 中序：不用先压root，注意while条件
    - 后序：双栈实现反转

## 二叉搜索树
- 有序
- right < root
- left > root
- 复杂度
    - 查询 logn
    - 插入 logn
    - 删除 logn

## Heap

找最大值/最小值

- find: O(1)
- insert: O(logn) / 斐波那契堆：O(1)
- delete: O(logn)

### 实现1: 二叉堆

完全二叉树（出最深一层外均饱满）

- insert: 插入队尾，向上冒泡
- delete: 替换顶部，向下调整

code:
- 索引为i的左孩子的索引是 2i+1
- 索引为i的右孩子的索引是 2i+2
- 索引为i的父节点索引是floor((i - 1) / 2)



