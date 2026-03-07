class Solution 
{
    public int minFlips(String s) 
    {
        int n=s.length();
        String d=s+s;
        char[] tar=new char[2*n];
        char[] tar2=new char[2*n];
        for(int i=0;i<2*n;i++)
        {
            tar[i]=(i%2==0)?'0':'1';
            tar2[i]=(i%2==0)?'1':'0';
        }
        int diff1=0 , diff2=0;
        int minflip=Integer.MAX_VALUE;
        for(int i=0;i<2*n;i++)
        {
            if(d.charAt(i)!=tar[i])diff1++;
            if(d.charAt(i)!=tar2[i])diff2++;
            if(i>=n)
            {
                if(d.charAt(i-n)!=tar[i-n])diff1--;
                if(d.charAt(i-n)!=tar2[i-n])diff2--;
            }
            if(i>=n-1)
            {
                minflip=Math.min(minflip,Math.min(diff1,diff2));
            }
        }
        return minflip;
    }
}
