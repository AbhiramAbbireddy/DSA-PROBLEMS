class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        for(int i=0;i<nums.length-1;i++) {
            int a=nums[i],b=nums[i+1];
            if(((a&1)==1 && (b&1)==1) || 
            ((a&1)==0 && (b&1)==0)) return false;
        }
        return true;
    }
}