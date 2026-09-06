class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length(),m=t.length();
        long[] dp=new long[m+1];
        dp[0]=1;
        for(int i=0;i<n;i++) {
            for(int j=m-1;j>=0;j--) {
                if(s.charAt(i)==t.charAt(j)) dp[j+1]+=dp[j];
            }
        }
        return (int) dp[m];
    }
}