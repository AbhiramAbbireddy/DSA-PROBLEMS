# Single Element in a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return  *the single element that appears only once*.

Your solution must run in `O(log n)` time and `O(1)` space.

 

 **Example 1:** 

```
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,3,7,7,10,11,11]
Output: 10

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 52.9 MB (beats 58.62%)  
**Submitted:** 2026-09-03T00:03:38.804Z  

```java
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high) {
            int mid=low+(high-low)/2;
            if((mid&1)==1) mid--;
            if(nums[mid]==nums[mid+1]) low=mid+2;
            else high=mid;
        }
        return nums[low];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-element-in-a-sorted-array/)