# Longest Subsequence With Non-Zero Bitwise XOR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`.

Return the length of the  **longest subsequence**  in `nums` whose bitwise  **XOR**  is  **non-zero**. If no such  **subsequence**  exists, return 0.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3]

 **Output:**  2

 **Explanation:** 

One longest subsequence is `[2, 3]`. The bitwise XOR is computed as `2 XOR 3 = 1`, which is non-zero.

 **Example 2:** 

 **Input:**  nums = [2,3,4]

 **Output:**  3

 **Explanation:** 

The longest subsequence is `[2, 3, 4]`. The bitwise XOR is computed as `2 XOR 3 XOR 4 = 5`, which is non-zero.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 68.38%)  
**Memory:** 133.2 MB (beats 95.59%)  
**Submitted:** 2026-08-15T02:44:05.883Z  

```java
class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean hasNonZero=false;
        int n=nums.length;
        for(int x: nums) {
            xor^=x;
            if(x!=0) hasNonZero=true;
        }
        if(xor!=0) return n;
        if(hasNonZero) return n-1;
        return 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/)