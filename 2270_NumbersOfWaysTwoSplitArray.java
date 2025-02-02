class Solution 
{
    public int waysToSplitArray(int[] nums) 
    {
       int n=nums.length;
       long total=0;
       for(int num:nums)
       {
         total+=num;
       }
       long left=0;
       int c=0;
       for(int i=0;i<n-1;i++)
       {
        left+=nums[i];
        long right=total-left;
        if(left>=right)
        {
            c++;
        }
       }
       return c; 
    }
}
