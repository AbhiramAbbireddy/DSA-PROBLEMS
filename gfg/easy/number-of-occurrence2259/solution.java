class Solution {
    int countFreq(int[] nums, int target) {
        int first=-1,last=-1;
        int left=0,right=nums.length-1;
        while(left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) {
                first=mid;
                right=mid-1;
            } else if(target>nums[mid]) left=mid+1;
            else right=mid-1;
        }
        left=0;right=nums.length-1;
        while(left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) {
                last=mid;
                left=mid+1;
            } else if(target>nums[mid]) left=mid+1;
            else right=mid-1;
        }
        if(first==-1) return 0;
        return last-first+1;
    }
}
