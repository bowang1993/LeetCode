## 问题
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
```
    3
   / \
  9  20
    /  \
   15   7
```
return its bottom-up level order traversal as:
```
[
  [15,7],
  [9,20],
  [3]
]
```
## 思路
其实就是二叉树的按层数遍历  
1. 使用队列
2. 使用两个变量记录当前行是否打印结束
  -  last:正在打印行的最后一个节点
  -  nlast:下一行最新加入的节点
3. 当队列弹出节点 == last时，表明当前行打印结束。需要换行，令  last = nlast;
4. 循环条件为队列是否为空。
