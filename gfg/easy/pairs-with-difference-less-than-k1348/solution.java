class Solution {
    public static int countPairs(int arr[], int k) {
        Arrays.sort(arr);
        int n=arr.length,pairs=0,i=0,j=1;
        while(i<n-1) {
            if(j<n && arr[j]-arr[i]<k) {
                pairs+=j-i;
                j++;
            } else {
                i++;
                if(j<=i) 
                    j=i+1;
            }
        }
        return pairs;
    }
}
