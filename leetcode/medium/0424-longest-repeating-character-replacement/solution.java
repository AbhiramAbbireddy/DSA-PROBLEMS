class Solution {
    public int characterReplacement(String s, int k) {
        s=s.toLowerCase();
        int[] freq=new int[26];
        int left=0,maxfreq=0,n=s.length(),len=0;
        for(int i=0;i<n;i++) {
            char c=s.charAt(i);
            freq[c-'a']++;
            maxfreq=Math.max(maxfreq,freq[c-'a']);
            while((i-left+1)-maxfreq>k) {
                char d=s.charAt(left);
                freq[d-'a']--;
                left++;
            }
            len=Math.max(len,i-left+1);
        }
        return len;
    }
}