class Solution {
    private int digitSum(int n) {
        int sum=0;
        while(n>0) {
            int rem=n%10;
            if(rem!=0) sum+=rem;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if(digitSum(nums[i])==i) return i;
        }
        return -1;
    }
}