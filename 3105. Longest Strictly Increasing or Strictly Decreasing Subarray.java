class Solution 
{
    public int longestMonotonicSubarray(int[] nums) 
    {
        int a=1;
        int n=1;
        int p=1;
        int m=nums.length;
        for(int i=0;i<m-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                n++;
            }
            else
            {
                n=1;
            }
            if(nums[i]>nums[i+1])
            {
                p++;
            }
            else{
                p=1;
            }
            a=Math.max(a,Math.max(n,p));
        }
        return a;
    }
}
