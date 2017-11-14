## 题目
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## 思路
找二叉树的最大深度

1. 考虑用递归实现，注意返回条件
  - 当root == null时 返回0
  - 当root没有子节点时，返回1
  - 当root只有一个子节点时，返回该子节点的子树的最大深度+当前节点  
  - 当root有两个节点时，返回两个子节点子树最大深度的最大值。
2. 找二叉树的最小深度同理。
