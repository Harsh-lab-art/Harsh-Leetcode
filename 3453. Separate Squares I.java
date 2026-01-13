class Solution 
{
    public double separateSquares(int[][] squares) 
    {
        double low=Double.MAX_VALUE;
        double high=Double.MIN_VALUE;
        for (int[] s:squares) 
        {
            low=Math.min(low,s[1]);
            high=Math.max(high,s[1]+s[2]);
        }
        for (int iter=0;iter<80;iter++) 
        {
            double mid=(low+high)/2;
            double below=0,above=0;
            for (int[] s:squares) 
            {
                double y=s[1];
                double l=s[2];
                if (mid<=y) 
                {
                    above+=l*l;
                } 
                else if (mid>=y+l) 
                {
                    below+=l*l;
                } 
                else 
                {
                    below+=l*(mid-y);
                    above+=l*((y+l)-mid);
                }
            }
            if (below<above)low=mid;
            else high=mid;
        }
        return low;
    }
}
        
