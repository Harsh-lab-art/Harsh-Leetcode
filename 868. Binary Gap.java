class Solution 
{
    public int binaryGap(int n) 
    {
        int m=0;
        int l=-1;
        int c=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                if(l!=-1)
                {
                    m=Math.max(m,c-l);
                }
            l=c;
            }
            n>>=1;
            c++;
        }
        return m;
    }
                
}
