# Binary Subarrays With Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums` and an integer `goal`, return  *the number of non-empty  **subarrays**  with a sum*  `goal`.

A  **subarray**  is a contiguous part of the array.

 

 **Example 1:** 

```
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]

```

 **Example 2:** 

```
Input: nums = [0,0,0,0,0], goal = 0
Output: 15

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- nums[i] is either 0 or 1.
- 0 <= goal <= nums.length

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.97%)  
**Memory:** 51 MB (beats 43.17%)  
**Submitted:** 2026-09-05T23:51:59.325Z  

```java
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sum(nums,goal)-sum(nums,goal-1);
    }
    private int sum(int[] arr, int goal) {
        if(goal<0) return 0;
        int n=arr.length,sum=0,left=0;
        int count=0;
        for(int r=0;r<n;r++) {
            sum+=arr[r];
            while(sum>goal) {
                sum-=arr[left];
                left++;
            }
            count+=(r-left+1);
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-subarrays-with-sum/)