# Minimum Moves to Clean the Classroom

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` grid `classroom` where a student volunteer is tasked with cleaning up litter scattered around the room. Each cell in the grid is one of the following:

- 'S': Starting position of the student
- 'L': Litter that must be collected (once collected, the cell becomes empty)
- 'R': Reset area that restores the student's energy to full capacity, regardless of their current energy level (can be used multiple times)
- 'X': Obstacle the student cannot pass through
- '.': Empty space

You are also given an integer `energy`, representing the student's maximum energy capacity. The student starts with this energy from the starting position `'S'`.

Each move to an adjacent cell (up, down, left, or right) costs 1 unit of energy. If the energy reaches 0, the student can only continue if they are on a reset area `'R'`, which resets the energy to its  **maximum**  capacity `energy`.

Return the  **minimum**  number of moves required to collect all litter items, or `-1` if it's impossible.

 

 **Example 1:** 

 **Input:**  classroom = ["S.", "XL"], energy = 2

 **Output:**  2

 **Explanation:** 

- The student starts at cell (0, 0) with 2 units of energy.
- Since cell (1, 0) contains an obstacle 'X', the student cannot move directly downward.
- A valid sequence of moves to collect all litter is as follows: Move 1: From (0, 0) → (0, 1) with 1 unit of energy and 1 unit remaining. Move 2: From (0, 1) → (1, 1) to collect the litter 'L'.
- The student collects all the litter using 2 moves. Thus, the output is 2.

 **Example 2:** 

 **Input:**  classroom = ["LS", "RL"], energy = 4

 **Output:**  3

 **Explanation:** 

- The student starts at cell (0, 1) with 4 units of energy.
- A valid sequence of moves to collect all litter is as follows: Move 1: From (0, 1) → (0, 0) to collect the first litter 'L' with 1 unit of energy used and 3 units remaining. Move 2: From (0, 0) → (1, 0) to 'R' to reset and restore energy back to 4. Move 3: From (1, 0) → (1, 1) to collect the second litter 'L'.
- The student collects all the litter using 3 moves. Thus, the output is 3.

 **Example 3:** 

 **Input:**  classroom = ["L.S", "RXL"], energy = 3

 **Output:**  -1

 **Explanation:** 

No valid path collects all `'L'`.

 

 **Constraints:** 

- 1 <= m == classroom.length <= 20
- 1 <= n == classroom[i].length <= 20
- classroom[i][j] is one of 'S', 'L', 'R', 'X', or '.'
- 1 <= energy <= 50
- There is exactly one 'S' in the grid.
- There are at most 10 'L' cells in the grid.

## Solution

**Language:** Java  
**Runtime:** 678 ms (beats 38.09%)  
**Memory:** 281.7 MB (beats 35.71%)  
**Submitted:** 2026-09-01T00:56:49.798Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/)