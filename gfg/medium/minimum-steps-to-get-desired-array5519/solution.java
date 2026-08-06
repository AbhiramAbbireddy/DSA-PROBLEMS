class Solution {
    public int countMinOperations(int arr[]) {
        int incr=0,doub=0;
        for(int n : arr) {
            int d=0;
            while(n>0) {
                if((n&1)==1) incr++;
                n/=2;
                if(n>0) d++;
            }
            doub=Math.max(doub,d);
        }
        return incr+doub;
    }
}