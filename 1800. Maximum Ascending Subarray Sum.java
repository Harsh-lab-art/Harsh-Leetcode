class Solution 
{
    public int maxAscendingSum(int[] nums) 
    {
        int n=nums.length;
        int sum=nums[0];
        int r=1;
        int maxsum=nums[0];
        while(r<n)
        {
            while(r<n && nums[r]>nums[r-1])
            {
                sum+=nums[r];
                r++;

            }
            maxsum=Math.max(maxsum,sum);
            if(r<n)
            {
                sum=nums[r];
                r++;
            }
        }
        return maxsum;
    }
}
