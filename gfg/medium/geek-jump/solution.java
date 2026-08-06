class Solution {
    int solve(int n, int[] height,int[] dp) {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int jumpTwo=Integer.MAX_VALUE;
        int oneJump=solve(n-1,height,dp)+Math.abs(height[n]-height[n-1]);
        if(n>1)
            jumpTwo=solve(n-2,height,dp)+Math.abs(height[n]-height[n-2]);
        dp[n]=Math.min(oneJump,jumpTwo);
        return dp[n];
    }
    int minCost(int[] height) {
        int n=height.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(n-1,height,dp);
    }
}