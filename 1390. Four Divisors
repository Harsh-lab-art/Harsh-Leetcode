class Solution 
{
    public int sumFourDivisors(int[] nums) 
    {
        int sum=0;
        for(int num:nums)
        {
            int c=0;;
            int s=0;
            for(int i=1;i*i<=num;i++)
            {
                if(num%i==0)
                {
                    int j=num/i;
                    c++;
                    s+=i;
                    if(i!=j)
                    {
                        c++;
                        s+=j;
                    }
                    if(c>4)
                    {
                        break;
                    }
                }
            }
            if(c==4)
            {
                sum+=s;
            }
        }
        return sum;
    }
}
