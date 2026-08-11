class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]+1) sum+=nums[i];
            else break;
        }
        boolean[] vis=new boolean[101];
        for(int n: nums) vis[n]=true;
        while(sum<=100 && vis[sum]) sum++;
        return sum;
    }
}