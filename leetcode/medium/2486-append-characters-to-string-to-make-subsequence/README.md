# Append Characters to String to Make Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two strings `s` and `t` consisting of only lowercase English letters.

Return  *the minimum number of characters that need to be appended to the end of* `s` *so that* `t` *becomes a  **subsequence**  of* `s`.

A  **subsequence**  is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.

 

 **Example 1:** 

```
Input: s = "coaching", t = "coding"
Output: 4
Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
Now, t is a subsequence of s ("coachingding").
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.

```

 **Example 2:** 

```
Input: s = "abcde", t = "a"
Output: 0
Explanation: t is already a subsequence of s ("abcde").

```

 **Example 3:** 

```
Input: s = "z", t = "abcde"
Output: 5
Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
Now, t is a subsequence of s ("zabcde").
It can be shown that appending any 4 characters to the end of s will never make t a subsequence.

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 105
- s and t consist only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 74.71%)  
**Memory:** 47.1 MB (beats 35.29%)  
**Submitted:** 2026-08-12T06:19:27.701Z  

```java
class Solution {
    public int appendCharacters(String s, String t) {
        int j=0;
        for(int i=0;i<s.length() && j<t.length();i++) {
            if(t.charAt(j)==s.charAt(i)) j++;
        }
        return t.length()-j;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/)