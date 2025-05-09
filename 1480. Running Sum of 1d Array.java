class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int arr[]={1,2,3,4};
        int []res=(obj.runningSum(arr));
    }
}
