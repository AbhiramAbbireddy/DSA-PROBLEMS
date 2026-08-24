# Count the Number of Consistent Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `allowed` consisting of  **distinct**  characters and an array of strings `words`. A string is  **consistent** if all characters in the string appear in the string `allowed`.

Return *the number of  **consistent**  strings in the array* `words`.

 

 **Example 1:** 

```
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

```

 **Example 2:** 

```
Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

```

 **Example 3:** 

```
Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

```

 

 **Constraints:** 

- 1 <= words.length <= 104
- 1 <= allowed.length <= 26
- 1 <= words[i].length <= 10
- The characters in allowed are distinct.
- words[i] and allowed contain only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 35.14%)  
**Memory:** 47.8 MB (beats 29.27%)  
**Submitted:** 2026-08-24T04:36:16.016Z  

```java
class Solution {
    private boolean areSame(int[] f1,int[] f2) {
        for(int i=0;i<26;i++) {
            if(f2[i]==1)
                if(f1[i]!=f2[i]) return false;
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq=new int[26];
        for(char c: allowed.toCharArray()) freq[c-'a']++;
        int count=0;
        for(String str: words) {
            int[] f=new int[26];
            for(char c: str.toCharArray()) {
                if(f[c-'a']==1) continue;
                f[c-'a']++;
            }
            if(areSame(freq,f)) count++;
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-the-number-of-consistent-strings/)