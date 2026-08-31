# Reverse Words in a String III

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

 **Example 1:** 

```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

```

 **Example 2:** 

```
Input: s = "Mr Ding"
Output: "rM gniD"

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- s contains printable ASCII characters.
- s does not contain any leading or trailing spaces.
- There is at least one word in s.
- All the words in s are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 52.83%)  
**Memory:** 46.9 MB (beats 37.48%)  
**Submitted:** 2026-08-31T13:39:21.779Z  

```java
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            str.append(new StringBuilder(arr[i]).reverse().toString());
            if(i!=arr.length-1) str.append(" ");
        }
        return str.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)