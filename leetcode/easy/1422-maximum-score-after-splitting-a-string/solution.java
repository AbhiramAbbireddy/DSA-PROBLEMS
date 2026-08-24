class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int[] suffix=new int[n];
        suffix[n-1]=s.charAt(n-1)=='1'?1:0;
        for(int i=n-2;i>=0;i--) {
            suffix[i]=s.charAt(i)=='1'?1+suffix[i+1]:suffix[i+1];
        }
        int score=0,left=0;
        for(int i=0;i<n-1;i++) {
            if(s.charAt(i)=='0') left++;
            score=Math.max(score,left+suffix[i+1]);
        }
        return score;
        
    }
}