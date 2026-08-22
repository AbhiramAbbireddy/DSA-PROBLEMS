# Check Divisibility by Digit Sum and Product

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer `n`. Determine whether `n` is divisible by the  **sum** of the following two values:

- The digit sum of n (the sum of its digits).
- The digit product of n (the product of its digits).

Return `true` if `n` is divisible by this sum; otherwise, return `false`.

 

 **Example 1:** 

 **Input:**  n = 99

 **Output:**  true

 **Explanation:** 

Since 99 is divisible by the sum (9 + 9 = 18) plus product (9 * 9 = 81) of its digits (total 99), the output is true.

 **Example 2:** 

 **Input:**  n = 23

 **Output:**  false

 **Explanation:** 

Since 23 is not divisible by the sum (2 + 3 = 5) plus product (2 * 3 = 6) of its digits (total 11), the output is false.

 

 **Constraints:** 

- 1 <= n <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42 MB (beats 96.00%)  
**Submitted:** 2026-08-22T08:28:50.062Z  

```java
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1;
        int temp=n;
        while(temp>0) {
            int d=temp%10;
            sum+=d;
            prod*=d;
            temp/=10;
        }
        return n%(sum+prod)==0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)