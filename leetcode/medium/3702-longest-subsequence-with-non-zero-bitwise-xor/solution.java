class Solution {
    public int longestSubsequence(int[] nums) {
        var xor=0;
        var hasNonZero=false;
        for(int x: nums) {
            xor^=x;
            if(x!=0) hasNonZero=true;
        }
        if(xor!=0) return nums.length;
        if(hasNonZero) return nums.length-1;
        return 0;
    }
}