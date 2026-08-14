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
**Runtime:** 4 ms (beats 15.47%)  
**Memory:** 43.7 MB (beats 74.28%)  
**Submitted:** 2026-08-14T00:28:04.865Z  

```java
class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        s.chars().forEach(c->freq[c-'a']++);
        int maxOdd=0,minEven=Integer.MAX_VALUE;
        for(int count: freq) {
            if(count==0) continue;
            if((count&1)==1) maxOdd=Math.max(maxOdd,count);
            else minEven=Math.min(minEven,count);
        }
        return maxOdd-minEven;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/)