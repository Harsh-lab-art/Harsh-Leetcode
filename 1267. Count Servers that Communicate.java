class Solution 
{
    public int countServers(int[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int[] rc=new int[n];
        int []cc=new int[m];
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    rc[i]++;
                    cc[j]++;
                    c++;
                }
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    if(rc[i]==1 && cc[j]==1)
                    c--;
                }
            }
        }
       return c;
    }
}
