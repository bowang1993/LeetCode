## 问题
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

##思路
1. 使用第一个数组从后往前遍历，比较赋值
2. 必要的时候，考虑数组为空的情况。（这里没考虑）
