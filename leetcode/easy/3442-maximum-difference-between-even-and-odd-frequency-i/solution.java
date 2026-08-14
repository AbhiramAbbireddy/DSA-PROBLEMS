class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        for(char c: s.toCharArray()) freq[c-'a']++;
        int largest=Integer.MIN_VALUE,small=Integer.MAX_VALUE;
        for(int i=0;i<26;i++) {
            if(freq[i]!=0 && (freq[i]&1)==1) largest=Math.max(largest,freq[i]);
            if(freq[i]!=0 && (freq[i]&1)==0) small=Math.min(small,freq[i]);
        }
        return largest-small;
    }
}