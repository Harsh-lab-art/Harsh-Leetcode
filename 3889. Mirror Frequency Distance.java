class Solution 
{
    public int mirrorFrequency(String s) 
    {
        int[] freq=new int[36];
        for(char c: s.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    freq[c-'0']++;
                }
                else
                {
                    freq[c-'a'+10]++;
                }
            }
        int res=0;
        for(int i=0;i<36;i++)
            {
                int mir=getmir(i);
                if(i<mir)
                {
                    res+=Math.abs(freq[i]-freq[mir]);
                }
            }
        return res;
    }
    public int getmir(int i)
    {
        if(i<10)
        {
            return 9-i;
        }
        return 35-(i-10);
    }
}
