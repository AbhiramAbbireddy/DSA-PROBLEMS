class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n=nums.length;
        long[] res=new long[k];
        for(int i=0;i<n;i++) {
            int rem=nums[i]%k;
            res[rem]++;
            for(int j=i+1;j<n;j++) {
                rem=(rem*nums[j])%k;
                res[rem]++;
            }
        }
        return res;
    }
}