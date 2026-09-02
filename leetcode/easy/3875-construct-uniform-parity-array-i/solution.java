class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        boolean even=true,odd=true;
        for(int i=0;i<n;i++) {
            if((nums1[i]&1)==1) {
                boolean found=false;
                for(int j=0;j<n;j++) {
                    if(j==i) continue;
                    int d=nums1[i]-nums1[j];
                    if((d&1)==0) {
                        found=true;
                        break;
                    }
                }
                if(!found){
                    even=false;
                    break;
                } 
                    
            }
        }
        for(int i=0;i<n;i++) {
            if((nums1[i]&1)==0) {
                boolean found=false;
                for(int j=0;j<n;j++) {
                    if(j==i) continue;
                    int d=nums1[i]-nums1[j];
                    if((d&1)==1) {
                        found=true;
                        break;
                    }
                }
                if(!found){
                    odd=false;
                    break;
                } 
                    
            }
        }
        return even || odd;
    }
}