class Solution 
{
    public int longestNiceSubarray(int[] nums) 
    {
        int st=0;
        int maxl=0;
        int bit=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            while((bit & nums[i])!=0)
            {
                bit=bit^nums[st];
                st++;
            }
            bit=bit|nums[i];
            maxl=Math.max(maxl,i-st+1);
        }
        return maxl;
    }
}
