class Solution 
{
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--)
        {
            long a =nums[i-2];
            long b= nums[i-1];
            long c=nums[i];
            if(a+b>c)
            {
                return (int)(a+b+c);
            }
        }
        return 0;
    }
}
