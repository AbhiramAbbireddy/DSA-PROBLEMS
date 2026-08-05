# Climbing Stairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

 

 **Example 1:** 

```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

```

 **Example 2:** 

```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

```

 

 **Constraints:** 

- 1 <= n <= 45

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.1 MB (beats 36.54%)  
**Submitted:** 2026-08-05T06:34:28.391Z  

```java
class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1) return 1;
        int prev=1,prev1=1;
        for(int i=1;i<n;i++) {
            int curr=prev1+prev;
            prev1=prev;
            prev=curr;
        }
        return prev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/climbing-stairs/)