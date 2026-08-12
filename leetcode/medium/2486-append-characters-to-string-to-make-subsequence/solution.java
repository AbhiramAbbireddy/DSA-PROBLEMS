class Solution {
    public int appendCharacters(String s, String t) {
        int j=0;
        for(int i=0;i<s.length() && j<t.length();i++) {
            if(t.charAt(j)==s.charAt(i)) j++;
        }
        return t.length()-j;
    }
}