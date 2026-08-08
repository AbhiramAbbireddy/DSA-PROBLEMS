# Minimum Path Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a `m x n` `grid` filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

 **Note:**  You can only move either down or right at any point in time.

 

 **Example 1:** 

```
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

```

 **Example 2:** 

```
Input: grid = [[1,2,3],[4,5,6]]
Output: 12

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 200
- 0 <= grid[i][j] <= 200

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.90%)  
**Memory:** 50.1 MB (beats 85.98%)  
**Submitted:** 2026-08-08T06:24:44.525Z  

```java
class Solution {
    private int solve(int i,int j,int[][] grid,int[][] dp) {
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return 1_000_000_000;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=grid[i][j]+solve(i-1,j,grid,dp);
        int left=grid[i][j]+solve(i,j-1,grid,dp);
        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] r: dp)
            Arrays.fill(r,-1);
        return solve(grid.length-1,grid[0].length-1,grid,dp);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-path-sum/)