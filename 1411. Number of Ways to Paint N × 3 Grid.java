class Solution 
{
    public int numOfWays(int n) 
    {
        final int mod=1_000_000_007;
        long a=6;
        long b=6;
        for(int i=2;i<=n;i++)
        {
            long newa=(a*3+b*2)%mod;
            long newb=(a*2+b*2)%mod;
            a=newa;
            b=newb;
        }
        return (int)((a+b)%mod);
    }
}
