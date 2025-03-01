class Solution {
    int [][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int minCost(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        int[][] mincost=new int[row][col];
        for(int r=0;r<row;r++)
        {
            Arrays.fill(mincost[r],Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0,0});
        mincost[0][0]=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int cost=curr[0],r=curr[1],c=curr[2];
            if(mincost[r][c]<cost) continue;
            for(int dir=0;dir<4;dir++)
            {
                int nextr=r+dirs[dir][0];
                int nextc=c+dirs[dir][1];
                if(nextr>=0 && nextr<row && nextc>=0 && nextc<col)
                {
                    int nextcelcost=(dir+1==grid[r][c])?0:1;
                    int newcost=cost+nextcelcost;
                    if(newcost<mincost[nextr][nextc])
                    {
                        mincost[nextr][nextc]=newcost;
                        pq.offer(new int[]{ newcost,nextr,nextc});
                    }
                }
            }
        }
        return mincost[row-1][col-1];
    }
}
