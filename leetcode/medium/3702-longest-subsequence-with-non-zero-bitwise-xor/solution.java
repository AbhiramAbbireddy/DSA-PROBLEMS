class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean hasNonZero=false;
        int n=nums.length;
        for(int x: nums) {
            xor^=x;
            if(x!=0) hasNonZero=true;
        }
        if(xor!=0) return n;
        if(hasNonZero) return n-1;
        return 0;
    }
}