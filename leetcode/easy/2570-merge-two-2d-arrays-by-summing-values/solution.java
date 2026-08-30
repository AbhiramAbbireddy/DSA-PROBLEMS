class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0;
        List<int[]> merge=new ArrayList<>();
        while(i<n1 && j<n2) {
            if(nums1[i][0]==nums2[j][0]) {
                merge.add(new int[]{
                    nums1[i][0],
                    nums1[i][1]+nums2[j][1]
                });
                i++;
                j++;
            } else if(nums1[i][0]<nums2[j][0]) {
                merge.add(nums1[i]);
                i++;
            } else {
                merge.add(nums2[j]);
                j++;
            }
        }
        while(i<n1) {
            merge.add(nums1[i]);
            i++;
        }
        while(j<n2) {
            merge.add(nums2[j]);
            j++;
        }
        int[][] res=new int[merge.size()][2];
        for(int k=0;k<merge.size();k++)
            res[k]=merge.get(k);
        return res;
    }
}