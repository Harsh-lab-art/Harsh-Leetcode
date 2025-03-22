class Solution 
{
    public int numOfSubarrays(int[] arr) 
    {
        int mod=1000000007;
        int even=1;
        int odd=0;
        int pre=0;
        int res=0;
        for(int num:arr)
        {
            pre+=num;
            if(pre%2==0)
            {
                res+=odd;
                even++;
            }
            else
            {
                res+=even;
                odd++;
            }
            res=res%mod;
        }
        return res;
    }
}
