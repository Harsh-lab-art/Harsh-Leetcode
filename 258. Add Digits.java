class Solution 
{
    public int addDigits(int num) 
    {
        
        while(num>=10)
        {
            int s=0;
            while(num!=0)
            {
                int l=num%10;
                s=s+l;
                num=num/10;
            }
            num=s;
        }
        return num;
    }
}
