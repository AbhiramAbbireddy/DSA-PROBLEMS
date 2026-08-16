class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incr=true,decr=true;
        int n=nums.length;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<nums[i-1]) incr=false;
            if(nums[i]>nums[i-1]) decr=false;
        }
        return incr || decr;
    }
}