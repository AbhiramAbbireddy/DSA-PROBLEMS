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
**Runtime:** 6 ms (beats 10.22%)  
**Memory:** 50.4 MB (beats 21.58%)  
**Submitted:** 2026-08-08T06:44:21.180Z  

```java
class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i==0 && j==0) dp[i][j]=grid[0][0];
                else {
                    int up=grid[i][j];
                    if(i>0) up+=dp[i-1][j];
                    else up+=(int) 1e9;
                    int left=grid[i][j];
                    if(j>0) left+=dp[i][j-1];
                    else left+=(int) 1e9;
                    dp[i][j]=Math.min(up,left);
                }
            }
        }
        return dp[m-1][n-1];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-path-sum/)