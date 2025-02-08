class Solution 
{
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        for(int i=0;i<k;i++)
        {
            int min=0;
           for(int j=0;j<nums.length;j++)
           {
            if(nums[j]<nums[min])
            {
                min=j;
            }
           }
           nums[min]=nums[min]*multiplier; 
        }
        return nums; 
    }
}
