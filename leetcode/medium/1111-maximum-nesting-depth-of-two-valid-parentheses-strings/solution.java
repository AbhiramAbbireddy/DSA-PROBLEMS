class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res=new int[seq.length()];
        int open=-1,i=0;
        for(char c: seq.toCharArray()) {
            if(c=='(') {
                open++;
                res[i++]=open%2;
            } else  {
                res[i++]=open%2;
                open--;
            }
        }
        return res;
    }
}