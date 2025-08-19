class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        long c=0;
        long ans=0;
        for(int n: nums)
        {
            if(n==0)
            {
                c++;
            }
            else
            {
                ans+=c*(c+1)/2;
                c=0;
            }
        }
        ans+=c*(c+1)/2;
        return ans;
    }
}
