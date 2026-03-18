class Solution 
{
    public int countSubmatrices(int[][] grid, int k) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        int pre[][]=new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                pre[i][j]=grid[i][j];
                if(i>0)
                {
                    pre[i][j]+=pre[i-1][j];
                }
                if(j>0)
                {
                    pre[i][j]+=pre[i][j-1];
                }
                if(i>0 && j>0)
                {
                    pre[i][j]-=pre[i-1][j-1];
                }
                if(pre[i][j]<=k)
                {
                    c++;
                }
            }
        }
        return c;
    }
}
