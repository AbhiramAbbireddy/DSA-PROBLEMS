# Reverse Substrings Between Each Pair of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should  **not**  contain any brackets.

 

 **Example 1:** 

```
Input: s = "(abcd)"
Output: "dcba"

```

 **Example 2:** 

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

 **Example 3:** 

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s only contains lower case English characters and parentheses.
- It is guaranteed that all parentheses are balanced.

## Solution

**Language:** Java  
**Runtime:** 24 ms (beats 17.41%)  
**Memory:** 47.2 MB (beats 15.29%)  
**Submitted:** 2026-09-27T08:43:22.565Z  

```java
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char c : s.toCharArray()) {
            if(c==')') {
                StringBuilder t=new StringBuilder();
                while(st.peek()!='(') t.append(st.pop());
                st.pop();
                for(char ch: t.toString().toCharArray()) st.push(ch);
            } else st.push(c);
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()) res.append(st.pop());
        return res.reverse().toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)