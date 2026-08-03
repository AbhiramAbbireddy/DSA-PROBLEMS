class Solution {
    public boolean search(int[] arr, int t) {
        int l=0,h=arr.length-1;
        while(l<=h) {
            int m=l+(h-l)/2;
            if(arr[m]==t)
                return true;
            if(arr[l]==arr[m] && arr[m]==arr[h]) {
                l++;
                h--;
            }
            else if(arr[l]<=arr[m]) {
                if(t>=arr[l] && t<arr[m])
                    h=m-1;
                else
                    l=m+1;
            } 
            else {
                if(t>arr[m] && t<=arr[h])
                    l=m+1;
                else
                    h=m-1;
            }
        }
        return false;
    }
}