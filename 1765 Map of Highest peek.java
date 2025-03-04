class Solution 
{
    public int[][] highestPeak(int[][] isWater) 
    {
        int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
        int n=isWater.length;
        int m=isWater[0].length;
        int res[][]=new int[n][m];
        Queue<int[]>queue=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(isWater[i][j]==1)
                {
                    res[i][j]=0;
                    queue.offer(new int[]{i,j});
                }
                else{
                    res[i][j]=-1;
                }
            }
        }
        while(!queue.isEmpty())
        {
            int cell[]=queue.poll();
            int r=cell[0];
            int c=cell[1];
            int h=res[r][c];
            for(int i=0;i<4;i++)
            {
                int nr=r+dir[i][0];
                int nc=c+dir[i][1];
                if(nr>=0 && nr<n && nc>=0 && nc<m && res[nr][nc]==-1)
                {
                    res[nr][nc]=h+1;
                    queue.offer(new int[]{nr,nc});
                }
            }
        }
        return res;
    }
}
