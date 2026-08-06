class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int prev1=nums[0];
        int prev=0;
        if(n>1)
            prev=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++) {
            int curr=Math.max(nums[i]+prev1,prev);
            prev1=prev;
            prev=curr;
        }
        return n>1?prev:prev1;
    }
}