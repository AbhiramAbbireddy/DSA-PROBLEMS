# Monotonic Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

An array is  **monotonic**  if it is either monotone increasing or monotone decreasing.

An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array `nums` is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`.

Given an integer array `nums`, return `true` *if the given array is monotonic, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: nums = [1,2,2,3]
Output: true

```

 **Example 2:** 

```
Input: nums = [6,5,4,4]
Output: true

```

 **Example 3:** 

```
Input: nums = [1,3,2]
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 67.39%)  
**Memory:** 85.4 MB (beats 7.23%)  
**Submitted:** 2026-08-16T11:45:24.375Z  

```java
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incr=true,decr=true;
        int n=nums.length;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<nums[i-1]) incr=false;
            if(nums[i]>nums[i-1]) decr=false;
        }
        return incr || decr;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/monotonic-array/)