# Frog Jump

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **height[]**  where height[i] represents the height of the i-th stair, a frog starts from the first stair and wants to reach the last stair.

From any stair i, the frog has two options: it can either jump to the (i+1)th stair or the (i+2)th stair. The cost of a jump is the absolute difference in height between the two stairs.

Determine the minimum total cost required for the frog to reach the last stair.

**Example:
**

```
Input: heights[] = [20, 30, 40, 20]
Output: 20
Explanation: Minimum cost is incurred when the frog jumps from stair 0 to 1 then 1 to 3:
jump from stair 0 to 1: cost = |30 - 20| = 10
jump from stair 1 to 3: cost = |20 - 30| = 10
Total Cost = 10 + 10 = 20
```

```
Input: heights[] = [30, 20, 50, 10, 40]
Output: 30
Explanation: Minimum cost will be incurred when frog jumps from stair 0 to 2 then 2 to 4:
jump from stair 0 to 2: cost = |50 - 30| = 20
jump from stair 2 to 4: cost = |40 - 50| = 10
Total Cost = 20 + 10 = 30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-06T00:06:58.187Z  

```java
class Solution {
    int solve(int n, int[] height,int[] dp) {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int jumpTwo=Integer.MAX_VALUE;
        int oneJump=solve(n-1,height,dp)+Math.abs(height[n]-height[n-1]);
        if(n>1)
            jumpTwo=solve(n-2,height,dp)+Math.abs(height[n]-height[n-2]);
        dp[n]=Math.min(oneJump,jumpTwo);
        return dp[n];
    }
    int minCost(int[] height) {
        int n=height.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(n-1,height,dp);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/geek-jump/1)