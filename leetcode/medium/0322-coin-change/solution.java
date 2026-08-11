class Solution {
    private static final int INF=1_000_000;
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,INF);
        dp[0]=0;
        for(int c=1;c<=amount;c++) {
            for(int coin: coins) {
                if(coin<=c) {
                    dp[c]=Math.min(dp[c],dp[c-coin]+1);
                }
            }
        }
        return dp[amount]>=INF?-1:dp[amount];
    }
}