# Coin Change

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money.

Return  *the fewest number of coins that you need to make up that amount*. If that amount of money cannot be made up by any combination of the coins, return `-1`.

You may assume that you have an infinite number of each kind of coin.

 

 **Example 1:** 

```
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

```

 **Example 2:** 

```
Input: coins = [2], amount = 3
Output: -1

```

 **Example 3:** 

```
Input: coins = [1], amount = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= coins.length <= 12
- 1 <= coins[i] <= 231 - 1
- 0 <= amount <= 104

## Solution

**Language:** Java  
**Runtime:** 25 ms (beats 31.84%)  
**Memory:** 46.6 MB (beats 40.59%)  
**Submitted:** 2026-08-11T01:30:10.528Z  

```java
class Solution {
    private static final int INF=1_000_000;
    private int solve(int[] coins, int amount, int[] dp) {
        if(amount==0) return 0;
        if(amount<0) return INF;
        if(dp[amount]!=-1) return dp[amount];
        int minamount=INF;
        for(int i=0;i<coins.length;i++) {
            minamount=Math.min(minamount,solve(coins,amount-coins[i],dp));
        }
        return dp[amount]=1+minamount;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int res=solve(coins,amount,dp);
        return res>=INF?-1:res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/coin-change/)