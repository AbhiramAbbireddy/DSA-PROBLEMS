class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[] prev=new int[n];
        for(int i=0;i<m;i++) {
            int[] temp=new int[n];
            for(int j=0;j<n;j++) {
                if(i==0 && j==0) {
                    temp[j]=grid[0][0];
                    continue;
                } else {
                    int up=grid[i][j];
                    up+=(i>0)?prev[j]:(int) 1e9;
                    int left=grid[i][j];
                    left+=(j>0)?temp[j-1]:(int) 1e9;
                    temp[j]=Math.min(up,left);
                }
            }
            prev=temp;
        }
        return prev[n-1];
    }
}