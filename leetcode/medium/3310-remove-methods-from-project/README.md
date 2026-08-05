# Remove Methods From Project

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are maintaining a project that has `n` methods numbered from `0` to `n - 1`.

You are given two integers `n` and `k`, and a 2D integer array `invocations`, where `invocations[i] = [ai, bi]` indicates that method `ai` invokes method `bi`.

There is a known bug in method `k`. Method `k`, along with any method invoked by it, either  **directly**  or  **indirectly**, are considered  **suspicious**  and we aim to remove them.

A group of methods can only be removed if no method  **outside**  the group invokes any methods  **within**  it.

Return an array containing all the remaining methods after removing all the  **suspicious**  methods. You may return the answer in  *any order*. If it is not possible to remove  **all**  the suspicious methods,  **none**  should be removed.

 

 **Example 1:** 

 **Input:**  n = 4, k = 1, invocations = [[1,2],[0,1],[3,2]]

 **Output:**  [0,1,2,3]

 **Explanation:** 

Method 2 and method 1 are suspicious, but they are directly invoked by methods 3 and 0, which are not suspicious. We return all elements without removing anything.

 **Example 2:** 

 **Input:**  n = 5, k = 0, invocations = [[1,2],[0,2],[0,1],[3,4]]

 **Output:**  [3,4]

 **Explanation:** 

Methods 0, 1, and 2 are suspicious and they are not directly invoked by any other method. We can remove them.

 **Example 3:** 

 **Input:**  n = 3, k = 2, invocations = [[1,2],[0,1],[2,0]]

 **Output:**  []

 **Explanation:** 

All methods are suspicious. We can remove them.

 

 **Constraints:** 

- 1 <= n <= 105
- 0 <= k <= n - 1
- 0 <= invocations.length <= 2 * 105
- invocations[i] == [ai, bi]
- 0 <= ai, bi <= n - 1
- ai != bi
- invocations[i] != invocations[j]

## Solution

**Language:** Java  
**Runtime:** 76 ms (beats 54.81%)  
**Memory:** 290.1 MB (beats 41.35%)  
**Submitted:** 2026-08-05T03:59:36.390Z  

```java
class Solution {
    private void dfs(int node,List<List<Integer>> adj,boolean[] sus) {
        if(sus[node]) return;
        sus[node]=true;
        for(int next: adj.get(node))
            dfs(next,adj,sus);
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] e: invocations)
            adj.get(e[0]).add(e[1]);
        boolean[] sus=new boolean[n];
        dfs(k,adj,sus);
        for(int[] e: invocations) {
            int u=e[0],v=e[1];
            if(!sus[u] && sus[v]) {
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++)
                    ans.add(i);
                return ans;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(!sus[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-methods-from-project/)