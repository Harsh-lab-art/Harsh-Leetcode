class Solution 
{
    public boolean check(int[] nums) 
    {
        int n=nums.length;
        if(n==1)
        return true;
        int pos=1;
        while(pos<n && nums[pos]>=nums[pos-1])
        pos++;
        if(pos==n)
        return true;
        if(nums[pos]>nums[0])
        return false;
        if(pos==n-1)
        return true;
        pos+=1;
        while(pos<n && nums[pos]<=nums[0] && nums[pos]>=nums[pos-1])
        pos++;
        return pos==n;
        
    }
}
