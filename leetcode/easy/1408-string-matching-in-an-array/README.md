# String Matching in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of string `words`, return all strings in `words` that are a substring of another word. You can return the answer in  **any order**.

 

 **Example 1:** 

```
Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.

```

 **Example 2:** 

```
Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".

```

 **Example 3:** 

```
Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length <= 30
- words[i] contains only lowercase English letters.
- All the strings of words are unique.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 14.27%)  
**Memory:** 43.5 MB (beats 82.19%)  
**Submitted:** 2026-08-12T10:21:54.200Z  

```java
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> match=new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words.length;j++) {
                if(i==j) continue;

                if(words[i].length()<words[j].length() &&
                words[j].contains(words[i])) {
                    match.add(words[i]);
                    break;
                }
            }
        }
        return match;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/string-matching-in-an-array/)