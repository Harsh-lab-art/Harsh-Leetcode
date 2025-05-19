class Solution 
{
    public int countDigits(int num) 
    {
        int k=num;
        int c=0;
        while(k>0)
        {
            int l=k%10;
            if(num%l==0)
            {
                c++;
            }
            k=k/10;
        }
        return c;
    }
}
