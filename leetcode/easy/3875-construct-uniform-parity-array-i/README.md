# Construct Uniform Parity Array I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array `nums1` of `n`  **distinct**  integers.

You want to construct another array `nums2` of length `n` such that the elements in `nums2` are either  **all odd or all even**.

For each index `i`, you must choose  **exactly one**  of the following (in any order):

- nums2[i] = nums1[i]
- nums2[i] = nums1[i] - nums1[j], for an index j != i

Return `true` if it is possible to construct such an array, otherwise, return `false`.

 

 **Example 1:** 

 **Input:**  nums1 = [2,3]

 **Output:**  true

 **Explanation:** 

- Choose nums2[0] = nums1[0] - nums1[1] = 2 - 3 = -1.
- Choose nums2[1] = nums1[1] = 3.
- nums2 = [-1, 3], and both elements are odd. Thus, the answer is true​​​​​​​.

 **Example 2:** 

 **Input:**  nums1 = [4,6]

 **Output:**  true

 **Explanation:** ​​​​​​​

- Choose nums2[0] = nums1[0] = 4.
- Choose nums2[1] = nums1[1] = 6.
- nums2 = [4, 6], and all elements are even. Thus, the answer is true.

 

 **Constraints:** 

- 1 <= n == nums1.length <= 100
- 1 <= nums1[i] <= 100
- nums1 consists of distinct integers.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 31.89%)  
**Memory:** 45.4 MB (beats 16.73%)  
**Submitted:** 2026-09-02T14:00:59.708Z  

```java
class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        boolean even=true,odd=true;
        for(int i=0;i<n;i++) {
            if((nums1[i]&1)==1) {
                boolean found=false;
                for(int j=0;j<n;j++) {
                    if(j==i) continue;
                    int d=nums1[i]-nums1[j];
                    if((d&1)==0) {
                        found=true;
                        break;
                    }
                }
                if(!found){
                    even=false;
                    break;
                } 
                    
            }
        }
        for(int i=0;i<n;i++) {
            if((nums1[i]&1)==0) {
                boolean found=false;
                for(int j=0;j<n;j++) {
                    if(j==i) continue;
                    int d=nums1[i]-nums1[j];
                    if((d&1)==1) {
                        found=true;
                        break;
                    }
                }
                if(!found){
                    odd=false;
                    break;
                } 
                    
            }
        }
        return even || odd;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/construct-uniform-parity-array-i/)