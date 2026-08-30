class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(char c: s.toCharArray()) freq[c-'a']++;
        int maxFreq=0;
        for(int f: freq) maxFreq=Math.max(maxFreq,f);
        if(maxFreq>(n+1)/2) return "";
        StringBuilder str=new StringBuilder();
        int prev=-1;
        for(int i=0;i<s.length();i++) {
            int best=-1;
            for(int j=0;j<26;j++) {
                if(freq[j]==0 || j==prev) continue;
                if(best==-1 || freq[j]>freq[best]) best=j;
            }
            if(best==-1) return "";
            str.append((char) ('a'+best));
            freq[best]--;
            prev=best;
        }
        return str.toString();
    }
}