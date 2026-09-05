class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length,left=0;
        int maxCons=0,zeroes=0;
        for(int right=0;right<n;right++) {
            if(nums[right]==0) zeroes++;
            while(zeroes>k) {
                if(nums[left]==0) zeroes--;
                left++;
            }
            maxCons=Math.max(maxCons,right-left+1);
        }
        return maxCons;
    }
}