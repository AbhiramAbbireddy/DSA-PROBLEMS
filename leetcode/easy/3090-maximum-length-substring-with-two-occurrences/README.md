# Maximum Length Substring With Two Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return the  **maximum**  length of a substring such that it contains  *at most two occurrences*  of each character.

 

 **Example 1:** 

 **Input:**  s = "bcbbbcba"

 **Output:**  4

 **Explanation:** 

The following substring has a length of 4 and contains at most two occurrences of each character: `"bcbbbcba"`.

 **Example 2:** 

 **Input:**  s = "aaaa"

 **Output:**  2

 **Explanation:** 

The following substring has a length of 2 and contains at most two occurrences of each character: `"aaaa"`.

 

 **Constraints:** 

- 2 <= s.length <= 100
- s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 43.02%)  
**Memory:** 44 MB (beats 37.62%)  
**Submitted:** 2026-08-14T00:51:39.341Z  

```java
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,length=0;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2) {
                char d=s.charAt(left);
                map.put(d,map.get(d)-1);
                if(map.get(d)==0) map.remove(d);
                left++;
            }
            length=Math.max(length,i-left+1);
        }
        return length;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/)