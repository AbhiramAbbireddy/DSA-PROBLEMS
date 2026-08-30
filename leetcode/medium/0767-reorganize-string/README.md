# Reorganize String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, rearrange the characters of `s` so that any two adjacent characters are not the same.

Return  *any possible rearrangement of*  `s`  *or return*  `""`  *if not possible*.

 

 **Example 1:** 

```
Input: s = "aab"
Output: "aba"

```

 **Example 2:** 

```
Input: s = "aaab"
Output: ""

```

 

 **Constraints:** 

- 1 <= s.length <= 500
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 76.80%)  
**Memory:** 43 MB (beats 54.98%)  
**Submitted:** 2026-08-30T07:36:01.875Z  

```java
class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(char c: s.toCharArray()) freq[c-'a']++;
        int maxFreq=0;
        for(int f: freq) maxFreq=Math.max(maxFreq,f);
        if(maxFreq>(n+1)/2) return "";
        StringBuilder str=new StringBuilder();
        int prev=-1;
        for(int i=0;i<s.length();i++) {
            int best=-1;
            for(int j=0;j<26;j++) {
                if(freq[j]==0 || j==prev) continue;
                if(best==-1 || freq[j]>freq[best]) best=j;
            }
            if(best==-1) return "";
            str.append((char) ('a'+best));
            freq[best]--;
            prev=best;
        }
        return str.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reorganize-string/)