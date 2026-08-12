# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.64%)  
**Memory:** 44.9 MB (beats 53.70%)  
**Submitted:** 2026-08-12T06:10:05.440Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c: s.toCharArray()) freq1[c-'a']++;
        for(char c: t.toCharArray()) freq2[c-'a']++;
        return Arrays.equals(freq1,freq2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)