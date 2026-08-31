class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        int n=s.length();
        while(i<j && s.charAt(i)==s.charAt(j)) {
            char c=s.charAt(i);
            while(i<=j && s.charAt(i)==c) i++;
            while(i<=j && s.charAt(j)==c) j--;
        }
        return j-i+1;
    }
}