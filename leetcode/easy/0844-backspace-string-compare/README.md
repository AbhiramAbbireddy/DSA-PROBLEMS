# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.8 MB (beats 79.04%)  
**Submitted:** 2026-08-30T05:17:59.213Z  

```java
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1,j=t.length()-1;
        int skips=0,skipt=0;
        while(i>=0 || j>=0) {
            while(i>=0) {
                if(s.charAt(i)=='#') {
                    skips++;
                    i--;
                } else if(skips>0) {
                    skips--;
                    i--;
                } else break;
            }
            while(j>=0) {
                if(t.charAt(j)=='#') {
                    skipt++;
                    j--;
                } else if(skipt>0) {
                    skipt--;
                    j--;
                } else break;
            }
            if(i>=0 && j>=0) {
                if(s.charAt(i)!=t.charAt(j)) return false;
            } else  {
                if(i>=0 || j>=0) return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)