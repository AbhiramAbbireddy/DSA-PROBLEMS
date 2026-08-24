# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48.3 MB (beats 55.53%)  
**Submitted:** 2026-08-24T23:52:46.385Z  

```java
class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r) {
            if(s[l]!=s[r]) {
                char temp=s[l];
                s[l]=s[r];
                s[r]=temp;
            }
            l++;
            r--;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)