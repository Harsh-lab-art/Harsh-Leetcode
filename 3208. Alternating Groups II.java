class Solution 
{
    public int numberOfAlternatingGroups(int[] colors, int k) 
    {
        int res=0;
        int l=0;
        int n=colors.length;
        for(int r=1;r<(n+k-1);r++)
        {
            if(colors[r%n]==colors[(r-1)%n])
            {
                l=r;
            }
            if(r-l+1==k)
            {
                res++;
                l++;
            }
        }
        return res;
    }
}
