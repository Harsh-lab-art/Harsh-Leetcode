class Solution 
{
    int rows;
    int cols;
    public int findMaxFish(int[][] grid) 
    {
        rows=grid.length;
        cols=grid[0].length;
        int fish=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]!=0)
                {
                    fish=Math.max(fish,dfs(i,j,grid));
                }
            }
        }
        return fish;
    }
    public int dfs(int r,int c,int grid[][])
    {
        if(r<0|| r>=rows||c<0||c>=cols||grid[r][c]==0)
        {
            return 0;
        }
        int ans=grid[r][c];
        grid[r][c]=0;
        ans+=dfs(r-1,c,grid)+dfs(r,c+1,grid)+dfs(r+1,c,grid)+dfs(r,c-1,grid);
        return ans;
    }
}
