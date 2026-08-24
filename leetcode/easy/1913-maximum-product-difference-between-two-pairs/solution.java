class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0]*nums[1];
        int b=nums[nums.length-1]*nums[nums.length-2];
        return b-a;
    }
}