# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 55.99%)  
**Memory:** 46.2 MB (beats 64.77%)  
**Submitted:** 2026-09-05T23:46:27.665Z  

```java
class Solution {
    public int characterReplacement(String s, int k) {
        s=s.toLowerCase();
        int[] freq=new int[26];
        int left=0,maxfreq=0,n=s.length(),len=0;
        for(int i=0;i<n;i++) {
            char c=s.charAt(i);
            freq[c-'a']++;
            maxfreq=Math.max(maxfreq,freq[c-'a']);
            while((i-left+1)-maxfreq>k) {
                char d=s.charAt(left);
                freq[d-'a']--;
                left++;
            }
            len=Math.max(len,i-left+1);
        }
        return len;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)