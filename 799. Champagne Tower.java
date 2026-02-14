class Solution 
{
    public double champagneTower(int poured, int query_row, int query_glass) 
    {
        double tow[][]=new double[102][102];
        tow[0][0]=(double)poured;
        for(int r=0;r<=query_row;r++)
        {
            for(int c=0;c<=r;c++)
            {
                double exc=(tow[r][c]-1.0)/2.0;
                if(exc>0)
                {
                    tow[r+1][c]+=exc;
                    tow[r+1][c+1]+=exc;
                }
            }
        }
        return Math.min(1.0,tow[query_row][query_glass]);
    }
}
