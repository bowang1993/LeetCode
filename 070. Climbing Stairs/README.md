## 题目
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

## 思路
典型的动态规划问题。  
1. 先将动态规划问题转化为数学问题
2. 求出第n项的表达式
3. 尽量避免穷举法（因为进行了很多的无用计算）
4. 一般的动态规划问题都可以使用hashmap解决
