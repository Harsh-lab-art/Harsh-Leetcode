class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        int n=fruits.length;
        int m=0;
        int a=-1;
        int b=-1;
        int l=-1;
        int co=0;
        int curr=0;
        for(int i=0;i<n;i++)
        {
            int fru=fruits[i];
            if(fru==a|| fru==b)
            {
                curr++;
            }
            else
            {
                curr=co+1;
            }
            if(fru==l)
            {
                co++;
            }
            else
            {
                co=1;
                a=b;
                b=fru;
            }
            l=fru;
            m=Math.max(m,curr);
        }
        return m;
    }
}
