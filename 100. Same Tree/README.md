## 题目
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


## 思路
1. 比较两个二叉树，直接比较二叉树序列化后的字符串是否相等即可
2. 在二叉树的每个节点使用%结尾（或者使用!）
3. 空节点使用#代替
4. 保证23就可以唯一序列化一个二叉树
