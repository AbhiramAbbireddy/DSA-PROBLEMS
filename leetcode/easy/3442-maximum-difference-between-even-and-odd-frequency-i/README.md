# Maximum Difference Between Even and Odd Frequency I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting of lowercase English letters.

Your task is to find the  **maximum**  difference `diff = freq(a1) - freq(a2)` between the frequency of characters `a1` and `a2` in the string such that:

- a1 has an odd frequency in the string.
- a2 has an even frequency in the string.

Return this  **maximum**  difference.

 

 **Example 1:** 

 **Input:**  s = "aaaaabbc"

 **Output:**  3

 **Explanation:** 

- The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
- The maximum difference is 5 - 2 = 3.

 **Example 2:** 

 **Input:**  s = "abcabcab"

 **Output:**  1

 **Explanation:** 

- The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
- The maximum difference is 3 - 2 = 1.

 

 **Constraints:** 

- 3 <= s.length <= 100
- s consists only of lowercase English letters.
- s contains at least one character with an odd frequency and one with an even frequency.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 43.5 MB (beats 82.55%)  
**Submitted:** 2026-08-14T00:23:35.774Z  

```java
class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        for(char c: s.toCharArray()) freq[c-'a']++;
        int largest=Integer.MIN_VALUE,small=Integer.MAX_VALUE;
        for(int i=0;i<26;i++) {
            if(freq[i]!=0 && (freq[i]&1)==1) largest=Math.max(largest,freq[i]);
            if(freq[i]!=0 && (freq[i]&1)==0) small=Math.min(small,freq[i]);
        }
        return largest-small;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/)