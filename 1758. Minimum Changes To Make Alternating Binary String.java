class Solution 
{
    public int minOperations(String s) 
    {
        int zero=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char exp=(i%2==0)?'0':'1';
            if (s.charAt(i) !=exp)
            {
                zero++;
            }
        }
        return Math.min(zero, n-zero);
    }
}
