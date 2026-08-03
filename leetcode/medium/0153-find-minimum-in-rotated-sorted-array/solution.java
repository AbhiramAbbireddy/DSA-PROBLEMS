class Solution {
    public int findMin(int[] a) {
        int l=0,h=a.length-1;
        while(l<h) {
            int m=l+(h-l)/2;
            if(a[m]>a[h])
                l=m+1;
            else if(a[m]<a[h])
                h=m;
            else
                h--;
        }
        return a[l];
    }
}