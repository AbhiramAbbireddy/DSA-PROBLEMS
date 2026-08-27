class Solution {
    public int uniqueLetterString(String s) {
        int n=s.length();
        int[] last=new int[26];
        int[] prev=new int[n];
        Arrays.fill(last,-1);
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            prev[i]=last[c-'A'];
            last[c-'A']=i;
        }
        Arrays.fill(last,n);
        int[] next=new int[n];
        for(int i=n-1;i>=0;i--) {
            char c=s.charAt(i);
            next[i]=last[c-'A'];
            last[c-'A']=i;
        }
        int sum=0;
        for(int i=0;i<s.length();i++) 
            sum+=((i-prev[i])*(next[i]-i));
        return sum;
    }
}