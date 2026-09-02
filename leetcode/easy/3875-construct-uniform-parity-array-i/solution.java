class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=0,even=0;
        for(int x: nums1) {
            if((x&1)==1) odd++;
            else even++;
        }
        boolean allEven=(odd==0 || odd>=2);
        boolean allOdd=(even==0 || odd>=1);
        return allEven || allOdd;
    }
}