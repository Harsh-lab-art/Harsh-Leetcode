class Solution 
{
    public int percentageLetter(String s, char letter) 
    {
        int n=s.length();
        int c=0;
        int per;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==letter)
            {
                c++;
            }
        }
        per=(c*100)/n;
        return per;
    }
}
