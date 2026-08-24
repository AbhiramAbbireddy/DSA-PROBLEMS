# Valid Palindrome II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return `true`  *if the* `s` *can be palindrome after deleting  **at most one**  character from it*.

 

 **Example 1:** 

```
Input: s = "aba"
Output: true

```

 **Example 2:** 

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

```

 **Example 3:** 

```
Input: s = "abc"
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 99.06%)  
**Memory:** 47.8 MB (beats 48.39%)  
**Submitted:** 2026-08-24T23:59:40.329Z  

```java
class Solution {
    private boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r) {
            if(s.charAt(l)!=s.charAt(r)) {
                return isPal(s,l+1,r) || isPal(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)