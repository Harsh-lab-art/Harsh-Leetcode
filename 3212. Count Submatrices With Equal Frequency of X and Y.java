class Solution 
{
    public int numberOfSubmatrices(char[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int [][] prex=new int[m+1][n+1];
        int [][] prey=new int[m+1][n+1];
        int res=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                prex[i+1][j+1]=prex[i][j+1]+prex[i+1][j]-prex[i][j]+(grid[i][j]=='X'?1:0);
                prey[i+1][j+1]=prey[i][j+1]+prey[i+1][j]-prey[i][j]+(grid[i][j]=='Y'?1:0);
                if(prex[i+1][j+1]==prey[i+1][j+1] && prex[i+1][j+1]>0)
                {
                    res++;
                }
            }
        }
        return res;
    }
}
