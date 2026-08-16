# Check if Array Is Sorted and Rotated

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums`, return `true` *if the array was originally sorted in non-decreasing order, then rotated  **some**  number of positions (including zero)*. Otherwise, return `false`.

There may be  **duplicates**  in the original array.

 **Note:**  An array `A` rotated by `x` positions results in an array `B` of the same length such that `B[i] == A[(i+x) % A.length]` for every valid index `i`.

 

 **Example 1:** 

```
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].

```

 **Example 2:** 

```
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.

```

 **Example 3:** 

```
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 65.66%)  
**Submitted:** 2026-08-16T11:40:38.511Z  

```java
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        int count=0;
        for(int i=1;i<n;i++) {
            if(nums[i]<nums[i-1]) {
                ++count;
                if(count>1) return false;
            }
        }
        if(nums[0]<nums[n-1]) ++count;
        return count<=1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)