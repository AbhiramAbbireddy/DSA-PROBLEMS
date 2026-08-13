# Longest Substring of One Repeating Character

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a  **0-indexed**  string `s`. You are also given a  **0-indexed**  string `queryCharacters` of length `k` and a  **0-indexed**  array of integer  **indices**  `queryIndices` of length `k`, both of which are used to describe `k` queries.

The `ith` query updates the character in `s` at index `queryIndices[i]` to the character `queryCharacters[i]`.

Return  *an array*  `lengths`  *of length* `k` *where*  `lengths[i]`  *is the  **length**  of the  **longest substring**  of* `s` *consisting of  **only one repeating**  character  **after**  the*  `ith`  *query** is performed.* 

 

 **Example 1:** 

```
Input: s = "babacc", queryCharacters = "bcb", queryIndices = [1,3,3]
Output: [3,3,4]
Explanation: 
- 1st query updates s = "bbbacc". The longest substring consisting of one repeating character is "bbb" with length 3.
- 2nd query updates s = "bbbccc". 
  The longest substring consisting of one repeating character can be "bbb" or "ccc" with length 3.
- 3rd query updates s = "bbbbcc". The longest substring consisting of one repeating character is "bbbb" with length 4.
Thus, we return [3,3,4].

```

 **Example 2:** 

```
Input: s = "abyzz", queryCharacters = "aa", queryIndices = [2,1]
Output: [2,3]
Explanation:
- 1st query updates s = "abazz". The longest substring consisting of one repeating character is "zz" with length 2.
- 2nd query updates s = "aaazz". The longest substring consisting of one repeating character is "aaa" with length 3.
Thus, we return [2,3].

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.
- k == queryCharacters.length == queryIndices.length
- 1 <= k <= 105
- queryCharacters consists of lowercase English letters.
- 0 <= queryIndices[i] < s.length

## Solution

**Language:** Java  
**Runtime:** 127 ms (beats 31.25%)  
**Memory:** 148 MB (beats 31.25%)  
**Submitted:** 2026-08-13T09:59:20.608Z  

```java
class Solution {
    class Node {
        char leftChar,rightChar;
        int prefix,suffix;
        int len;
        int best;
    }
    Node[] tree;
    char[] arr;
    private void build(int idx,int l,int r) {
        if(l==r) {
            tree[idx]=new Node();
            tree[idx].leftChar=arr[l];
            tree[idx].rightChar=arr[r];
            tree[idx].prefix=1;
            tree[idx].suffix=1;
            tree[idx].len=1;
            tree[idx].best=1;
            return;
        }
        int mid=l+(r-l)/2;
        build(2*idx,l,mid);
        build(2*idx+1,mid+1,r);
        tree[idx]=merge(tree[2*idx],tree[2*idx+1]);
    }
    private Node merge(Node left,Node right) {
        Node parent=new Node();
        parent.len=left.len+right.len;
        parent.leftChar=left.leftChar;
        parent.rightChar=right.rightChar;
        parent.prefix=left.prefix;
        if(left.prefix==left.len && left.rightChar==right.leftChar)
            parent.prefix=left.len+right.prefix;
        parent.suffix=right.suffix;
        if(right.suffix==right.len && left.rightChar==right.leftChar)
            parent.suffix=right.len+left.suffix;
        parent.best=Math.max(left.best,right.best);
        if(left.rightChar==right.leftChar)
            parent.best=Math.max(parent.best,left.suffix+right.prefix);
        return parent;
    }
    private void update(int idx,int l,int r,int pos,char c) {
        if(l==r) {
            arr[pos]=c;
            tree[idx].leftChar=c;
            tree[idx].rightChar=c;
            tree[idx].prefix=1;
            tree[idx].suffix=1;
            tree[idx].best=1;
            return;
        }
        int mid=l+(r-l)/2;
        if(pos<=mid)
            update(2*idx,l,mid,pos,c);
        else
            update(2*idx+1,mid+1,r,pos,c);
        tree[idx]=merge(tree[2*idx],tree[2*idx+1]);
    }
    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        arr=s.toCharArray();
        int n=arr.length;
        tree=new Node[4*n];
        build(1,0,n-1);
        int[] res=new int[queryIndices.length];
        for(int i=0;i<res.length;i++) {
            update(1,0,n-1,queryIndices[i],queryCharacters.charAt(i));
            res[i]=tree[1].best;
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-of-one-repeating-character/)