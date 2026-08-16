# Maximum Number of Balloons

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `text`, you want to use the characters of `text` to form as many instances of the word  **"balloon"**  as possible.

You can use each character in `text`  **at most once**. Return the maximum number of instances that can be formed.

 

 **Example 1:** 

```
Input: text = "nlaebolko"
Output: 1

```

 **Example 2:** 

```
Input: text = "loonbalxballpoon"
Output: 2

```

 **Example 3:** 

```
Input: text = "leetcode"
Output: 0

```

 

 **Constraints:** 

- 1 <= text.length <= 104
- text consists of lower case English letters only.

 

 **Note:**  This question is the same as 2287: Rearrange Characters to Make Target String.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 93.03%)  
**Memory:** 43 MB (beats 95.80%)  
**Submitted:** 2026-08-16T11:17:38.313Z  

```java
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        for(char c: text.toCharArray()) freq[c-'a']++;
        freq['l'-'a']/=2;
        freq['o'-'a']/=2;
        return Math.min(
            Math.min(freq['b' - 'a'], freq['a' - 'a']),
            Math.min(freq['l' - 'a'],
                     Math.min(freq['o' - 'a'], freq['n' - 'a']))
        );
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-balloons/)