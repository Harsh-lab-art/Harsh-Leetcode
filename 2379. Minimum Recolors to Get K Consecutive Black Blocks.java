class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        int w=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            w++;
        }
        int res=w;
        int n=blocks.length();
        for(int i=1;i<(n-k+1);i++)
        {
            if(blocks.charAt(i-1)=='W')
            w--;
            if(blocks.charAt(i+k-1)=='W')
            w++;
            res=Math.min(res,w);
        }
        return res;
    }
}
