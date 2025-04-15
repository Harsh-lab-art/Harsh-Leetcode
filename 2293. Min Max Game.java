class Solution 
{
    public int minMaxGame(int[] nums) 
    {
        while(nums.length>1)
        {
            int n=nums.length;
            int []nn= new int[n/2];
            for(int i=0;i<n/2;i++)
            {
                if(i%2==0)
                {
                    nn[i]=Math.min(nums[2 * i], nums[2 * i + 1]);
                }
                else
                {
                    nn[i]=Math.max(nums[2*i],nums[2*i+1]);
                }
            }
            nums=nn;
        }
        return nums[0];
    }
}
