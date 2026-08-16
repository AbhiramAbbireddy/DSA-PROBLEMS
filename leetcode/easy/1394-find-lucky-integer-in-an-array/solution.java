class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int n: arr) freq[n]++;
        int lucky=-1;
        for(int n: arr) {
            if(freq[n]==n) lucky=Math.max(lucky,n);
        }
        return lucky!=-1?lucky:-1;
    }
}