class Solution {
    private boolean areSame(int[] f1,int[] f2) {
        for(int i=0;i<26;i++) {
            if(f2[i]==1)
                if(f1[i]!=f2[i]) return false;
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq=new int[26];
        for(char c: allowed.toCharArray()) freq[c-'a']++;
        int count=0;
        for(String str: words) {
            int[] f=new int[26];
            for(char c: str.toCharArray()) {
                if(f[c-'a']==1) continue;
                f[c-'a']++;
            }
            if(areSame(freq,f)) count++;
        }
        return count;
    }
}