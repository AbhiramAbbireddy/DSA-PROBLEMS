# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 82.89%)  
**Memory:** 43.1 MB (beats 17.25%)  
**Submitted:** 2026-08-27T16:22:48.080Z  

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] vis=new boolean[26];
        int count=0;
        for(char c: sentence.toCharArray()) {
            if(!vis[c-'a']) {
                vis[c-'a']=true;
                count++;
                if(count==26) return true;
            }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)