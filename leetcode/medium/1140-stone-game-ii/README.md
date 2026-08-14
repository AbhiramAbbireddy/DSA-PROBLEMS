# Stone Game II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Alice and Bob continue their games with piles of stones. There are a number of piles  **arranged in a row**, and each pile has a positive integer number of stones `piles[i]`. The objective of the game is to end with the most stones.

Alice and Bob take turns, with Alice starting first.

On each player's turn, that player can take  **all the stones**  in the  **first**  `X` remaining piles, where `1 <= X <= 2M`. Then, we set `M = max(M, X)`. Initially, M = 1.

The game continues until all the stones have been taken.

Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.

 

 **Example 1:** 

 **Input:**  piles = [2,7,9,4,4]

 **Output:**  10

 **Explanation:** 

- If Alice takes one pile at the beginning, Bob takes two piles, then Alice takes 2 piles again. Alice can get 2 + 4 + 4 = 10 stones in total.
- If Alice takes two piles at the beginning, then Bob can take all three piles left. In this case, Alice get 2 + 7 = 9 stones in total.

So we return 10 since it's larger.

 **Example 2:** 

 **Input:**  piles = [1,2,3,4,5,100]

 **Output:**  104

 

 **Constraints:** 

- 1 <= piles.length <= 100
- 1 <= piles[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 22 ms (beats 5.60%)  
**Memory:** 44.5 MB (beats 33.01%)  
**Submitted:** 2026-08-14T01:41:25.653Z  

```java
class Solution {

    public int stoneGameII(int[] piles) {
        int length = piles.length;
        int[][] dp = new int[length + 1][length + 1];

        // Store suffix sum for all possible suffix
        int[] suffixSum = new int[length + 1];
        for (int i = length - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        // Initialize the dp array.
        for (int i = 0; i <= length; i++) {
            dp[i][length] = suffixSum[i];
        }

        // Start from the last index to store the future state first.
        for (int index = length - 1; index >= 0; index--) {
            for (int maxTillNow = length - 1; maxTillNow >= 1; maxTillNow--) {
                for (
                    int X = 1;
                    X <= 2 * maxTillNow && index + X <= length;
                    X++
                ) {
                    dp[index][maxTillNow] = Math.max(
                        dp[index][maxTillNow],
                        suffixSum[index] -
                        dp[index + X][Math.max(maxTillNow, X)]
                    );
                }
            }
        }
        return dp[0][1];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-ii/)