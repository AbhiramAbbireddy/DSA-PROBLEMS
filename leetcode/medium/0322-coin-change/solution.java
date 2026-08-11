class Solution {
    private static final int INF=1_000_000;
    private int solve(int[] coins, int amount, int[] dp) {
        if(amount==0) return 0;
        if(amount<0) return INF;
        if(dp[amount]!=-1) return dp[amount];
        int minamount=INF;
        for(int i=0;i<coins.length;i++) {
            minamount=Math.min(minamount,solve(coins,amount-coins[i],dp));
        }
        return dp[amount]=1+minamount;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int res=solve(coins,amount,dp);
        return res>=INF?-1:res;
    }
}