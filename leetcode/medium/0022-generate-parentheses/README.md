# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

 **Example 1:** 

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input: n = 1
Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.2 MB (beats 86.85%)  
**Submitted:** 2026-08-27T16:47:13.738Z  

```java
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backtrack(res,new StringBuilder(),0,0,n);
        return res;
    }
    private void backtrack(List<String> res,StringBuilder curr,int open,int close,int n) {
        if(curr.length()==2*n) {
            res.add(curr.toString());
            return;
        }
        if(open<n) {
            curr.append("(");
            backtrack(res,curr,open+1,close,n);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open) {
            curr.append(")");
            backtrack(res,curr,open,close+1,n);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)