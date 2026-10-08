# Remove Outermost Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A valid parentheses string is either empty `""`, `"(" + A + ")"`, or `A + B`, where `A` and `B` are valid parentheses strings, and `+` represents string concatenation.

- For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string `s` is primitive if it is nonempty, and there does not exist a way to split it into `s = A + B`, with `A` and `B` nonempty valid parentheses strings.

Given a valid parentheses string `s`, consider its primitive decomposition: `s = P1 + P2 +... + Pk`, where `Pi` are primitive valid parentheses strings.

Return `s`  *after removing the outermost parentheses of every primitive string in the primitive decomposition of* `s`.

 

 **Example 1:** 

```
Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

```

 **Example 2:** 

```
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

```

 **Example 3:** 

```
Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is either '(' or ')'.
- s is a valid parentheses string.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 30.80%)  
**Memory:** 43.4 MB (beats 83.98%)  
**Submitted:** 2026-10-08T04:08:16.082Z  

```java
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c=='(') {
                if(!st.isEmpty()) 
                    str.append(c);
                st.push(c);
            } else {
                st.pop();
                if(!st.isEmpty())
                    str.append(c);
            }
        }
        return str.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-outermost-parentheses/)