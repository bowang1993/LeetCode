## 题目
Implement int sqrt(int x).

Compute and return the square root of x.

x is guaranteed to be a non-negative integer.


## 思路
使用二分查找  
注意二分查找的几个关键点
- 不断去除不符合条件的区间（包括mid节点）
- 设置返回条件（找到即返回），找不到返回-1
- 初始条件尽量单独写，x<1
