## 题目
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

## 思路
这个题一开始的思路没理清楚，一直想着用序列化或者中序遍历来做。  
1. 中序遍历不能唯一确定一个二叉树
2. 中序遍历也不适用于本题
3. 可以使用非递归，类似于宽度优先遍历，使用堆栈或者队列依次遍历每层。确定每层是否镜像。（挖个坑，以后再写）
