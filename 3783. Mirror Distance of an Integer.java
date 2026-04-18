class Solution 
{
    public int mirrorDistance(int n) 
    {
        int la,rev=0;
        int m=n;
        while(m>0)
        {
            la=m%10;
            rev=rev*10+la;
            m=m/10;
        }
        int r=Math.abs(n-rev);
        return r;

    }
}
