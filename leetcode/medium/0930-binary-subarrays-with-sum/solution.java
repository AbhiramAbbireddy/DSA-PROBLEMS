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