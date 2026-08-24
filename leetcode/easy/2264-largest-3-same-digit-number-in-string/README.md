# Largest 3-Same-Digit Number in String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `num` representing a large integer. An integer is  **good**  if it meets the following conditions:

- It is a substring of num with length 3.
- It consists of only one unique digit.

Return  *the  **maximum good** integer as a  **string**  or an empty string* `""` *if no such integer exists*.

Note:

- A substring is a contiguous sequence of characters within a string.
- There may be leading zeroes in num or a good integer.

 

 **Example 1:** 

```
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".

```

 **Example 2:** 

```
Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.

```

 **Example 3:** 

```
Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.

```

 

 **Constraints:** 

- 3 <= num.length <= 1000
- num only consists of digits.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.2 MB (beats 82.69%)  
**Submitted:** 2026-08-24T23:10:01.340Z  

```java
class Solution {
    public String largestGoodInteger(String num) {
        if(num.contains("999"))return "999";
        if(num.contains("888"))return "888";
        if(num.contains("777"))return "777";
        if(num.contains("666"))return "666";
        if(num.contains("555"))return "555";
        if(num.contains("444"))return "444";
        if(num.contains("333"))return "333";
        if(num.contains("222"))return "222";
        if(num.contains("111"))return "111";
        if(num.contains("000"))return "000";
        return "";
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-3-same-digit-number-in-string/)