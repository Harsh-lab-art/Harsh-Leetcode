class Solution 
{
    public long gridGame(int[][] grid) 
    {
        long t=0;
        int n=grid[0].length;
        for(int i=0;i<n;i++)
        {
            t+=grid[0][i];
        }
        long b=0;
        long ans=Long.MAX_VALUE;
        for(int j=0;j<n;j++)
        {
            t-=grid[0][j];
            ans=Math.min(ans,Math.max(t,b));
            b+=grid[1][j];
        }
        return ans;
    }
    
}
