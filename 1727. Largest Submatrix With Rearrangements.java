class Solution 
{
    public int largestSubmatrix(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int marea=0;
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==1)
                {
                    matrix[i][j]+=matrix[i-1][j];
                }
            }
        }
        for (int i=0;i<m;i++)
        {
            int[] r=matrix[i].clone();
            Arrays.sort(r);
            for(int j=0;j<n;j++)
            {
                int h=r[n-1-j];
                int w=j+1;
                marea=Math.max(marea,h*w);
            }
        }
        return marea;
    }
}
