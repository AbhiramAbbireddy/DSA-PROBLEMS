class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length,N=n*n,totalSum=(N*(N+1))/2;
        int curr=0;
        int a=0,b=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(set.contains(grid[i][j])) a=grid[i][j];
                else {
                    set.add(grid[i][j]);
                    curr+=grid[i][j];
                }
            }
        }
        b=totalSum-curr;
        return new int[]{a,b};
    }
}