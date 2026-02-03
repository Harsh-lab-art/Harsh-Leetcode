class Solution 
{
    public boolean isTrionic(int[] nums) 
    {
        int n=nums.length;
        int i=0;
        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
        }
        if(i==0)
        return false;
        int p=i;
        while(i+1<n&& nums[i]> nums[i+1])
        {
            i++;
        }
        if(i==p)
        return false;
        int q=i;
        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
        }
        if(i==q)
        return false;
        return i==n-1;
    }
}
