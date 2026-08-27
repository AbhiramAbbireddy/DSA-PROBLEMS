class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] vis=new boolean[26];
        int count=0;
        for(char c: sentence.toCharArray()) {
            if(!vis[c-'a']) {
                vis[c-'a']=true;
                count++;
                if(count==26) return true;
            }
        }
        return false;
    }
}