class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        s.chars().forEach(c->freq[c-'a']++);
        int maxOdd=0,minEven=Integer.MAX_VALUE;
        for(int count: freq) {
            if(count==0) continue;
            if((count&1)==1) maxOdd=Math.max(maxOdd,count);
            else minEven=Math.min(minEven,count);
        }
        return maxOdd-minEven;
    }
}