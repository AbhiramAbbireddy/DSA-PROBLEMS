# Search in Rotated Sorted Array II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is an integer array `nums` sorted in non-decreasing order (not necessarily with  **distinct**  values).

Before being passed to your function, `nums` is  **rotated**  at an unknown pivot index `k` (`0 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1],..., nums[n-1], nums[0], nums[1],..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,4,4,5,6,6,7]` might be rotated at pivot index `5` and become `[4,5,6,6,7,0,1,2,4,4]`.

Given the array `nums`  **after**  the rotation and an integer `target`, return `true` *if* `target` *is in* `nums` *, or* `false` *if it is not in* `nums` *.* 

You must decrease the overall operation steps as much as possible.

 

 **Example 1:** 

```
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

```

 **Example 2:** 

```
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- -104 <= nums[i] <= 104
- nums is guaranteed to be rotated at some pivot.
- -104 <= target <= 104

 

 **Follow up:**  This problem is similar to Search in Rotated Sorted Array, but `nums` may contain  **duplicates**. Would this affect the runtime complexity? How and why?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.1 MB (beats 99.86%)  
**Submitted:** 2026-08-03T14:37:00.805Z  

```java
class Solution {
    public boolean search(int[] arr, int t) {
        int l=0,h=arr.length-1;
        while(l<=h) {
            int m=l+(h-l)/2;
            if(arr[m]==t)
                return true;
            if(arr[l]==arr[m] && arr[m]==arr[h]) {
                l++;
                h--;
            }
            else if(arr[l]<=arr[m]) {
                if(t>=arr[l] && t<arr[m])
                    h=m-1;
                else
                    l=m+1;
            } 
            else {
                if(t>arr[m] && t<=arr[h])
                    l=m+1;
                else
                    h=m-1;
            }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)