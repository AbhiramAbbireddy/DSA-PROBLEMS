# Largest 3-Same-Digit Number in String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `num` representing a large integer. An integer is  **good**  if it meets the following conditions:

- It is a substring of num with length 3.
- It consists of only one unique digit.

Return  *the  **maximum good** integer as a  **string**  or an empty string* `""` *if no such integer exists*.

Note:

- A substring is a contiguous sequence of characters within a string.
- There may be leading zeroes in num or a good integer.

 

 **Example 1:** 

```
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".

```

 **Example 2:** 

```
Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.

```

 **Example 3:** 

```
Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.

```

 

 **Constraints:** 

- 3 <= num.length <= 1000
- num only consists of digits.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 7.15%)  
**Memory:** 44.5 MB (beats 34.15%)  
**Submitted:** 2026-08-24T23:09:01.338Z  

```java
class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<3;i++) {
            char c=num.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String ans="";
        if(map.size()==1) ans=num.substring(0,3);
        for(int i=1;i<=n-3;i++) {
            char a=num.charAt(i-1),b=num.charAt(i+2);
            map.put(a,map.get(a)-1);
            if(map.get(a)==0) map.remove(a);
            map.put(b,map.getOrDefault(b,0)+1);
            if(map.size()==1) {
                String curr=num.substring(i,i+3);
                if(ans.equals("") || curr.compareTo(ans)>0) ans=curr;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-3-same-digit-number-in-string/)