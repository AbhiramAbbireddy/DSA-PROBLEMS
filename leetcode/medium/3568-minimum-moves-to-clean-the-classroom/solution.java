class Solution {
    public int minMoves(String[] classroom, int energy) {
        char[][] grid=new char[classroom.length][classroom[0].length()];
        int n=classroom.length,m=classroom[0].length();
        int[][] d={{0,1},{1,0},{0,-1},{-1,0}};
        int si=0,sj=0;
        int lCount=0;
        int[][] lIndex=new int[n][m];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<classroom[i].length();j++) {
                grid[i][j]=classroom[i].charAt(j);
                if(grid[i][j]=='S') {si=i;sj=j;}
                if(grid[i][j]=='L') lIndex[i][j]=lCount++;
            }
        }
        int fullMask=(1<<lCount)-1;
        boolean[][][][] vis=new boolean[n][m][1<<lCount][energy+1];
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{si,sj,0,energy,0});
        vis[si][sj][0][energy]=true;
        while(!q.isEmpty()) {
            int[] t=q.poll();
            int x=t[0],y=t[1],mask=t[2],eng=t[3],moves=t[4];
            if(mask==fullMask) return moves;
            for(int i=0;i<4;i++) {
                int nx=x+d[i][0],ny=y+d[i][1];
                if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                if(grid[nx][ny]=='X' || eng==0) continue;
                int newEng=eng-1;
                int newMask=mask;
                if(grid[nx][ny]=='R') newEng=energy;
                if(grid[nx][ny]=='L') newMask|=(1<<lIndex[nx][ny]);
                if(!vis[nx][ny][newMask][newEng]) {
                    vis[nx][ny][newMask][newEng]=true;
                    q.offer(new int[]{nx,ny,newMask,newEng,moves+1});
                }


                
            }
        }
        return -1;
    }
}