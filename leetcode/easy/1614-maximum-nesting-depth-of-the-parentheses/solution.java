class Solution {
    public int maxDepth(String s) {
        int open=0,maxNest=0;
        for(char c: s.toCharArray()) {
            if(c=='(') {
                open++;
                maxNest=Math.max(maxNest,open);
            } else if(c==')') open--;
        }
        return maxNest;
    }
}