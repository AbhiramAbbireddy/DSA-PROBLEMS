# Path Crossing

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `path`, where `path[i] = 'N'`, `'S'`, `'E'` or `'W'`, each representing moving one unit north, south, east, or west, respectively. You start at the origin `(0, 0)` on a 2D plane and walk on the path specified by `path`.

Return `true`  *if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited*. Return `false` otherwise.

 

 **Example 1:** 

```
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.

```

 **Example 2:** 

```
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
```

 

 **Constraints:** 

- 1 <= path.length <= 104
- path[i] is either 'N', 'S', 'E', or 'W'.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 79.30%)  
**Memory:** 43.4 MB (beats 56.69%)  
**Submitted:** 2026-08-24T23:42:38.283Z  

```java
class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set=new HashSet<>();
        set.add("0,0");
        int x=0,y=0;
        for(char c: path.toCharArray()) {
            if(c=='N') y+=1;
            else if(c=='E') x+=1;
            else if(c=='W') x-=1;
            else y-=1;
            String curr=x+","+y;
            if(set.contains(curr)) return true;
            set.add(curr);
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/path-crossing/)