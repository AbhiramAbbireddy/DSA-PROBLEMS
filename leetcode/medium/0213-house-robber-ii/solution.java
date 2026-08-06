class Solution {
    private int houserobber(int[] nums,int st,int end) {
        if(end-st==1) return nums[st];
        int prev1=nums[st];
        int prev=Math.max(nums[st],nums[st+1]);
        for(int i=st+2;i<end;i++) {
            int curr=Math.max(nums[i]+prev1,prev);
            prev1=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(houserobber(nums,0,nums.length-1),
        houserobber(nums,1,nums.length));
    }
}