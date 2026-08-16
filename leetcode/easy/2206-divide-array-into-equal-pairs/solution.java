class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq=new int[501];
        for(int num: nums) freq[num]++;
        for(int count: freq) {
            if((count&1)==1) return false;
        }
        return true;
    }
}