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
**Runtime:** 4 ms (beats 85.45%)  
**Memory:** 46.4 MB (beats 81.21%)  
**Submitted:** 2026-08-31T13:45:54.132Z  

```java
class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        for(int end=0;end<=arr.length;end++) {
            if(end==arr.length || arr[end]==' ') {
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
        return new String(arr);
    }
    void reverse(char[] arr,int left,int right) {
        while(left<right) {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)