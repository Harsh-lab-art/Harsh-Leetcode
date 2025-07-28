class Solution 
{
    public int countMaxOrSubsets(int[] nums) 
    {
        int maxx=0;
        for(int num:nums)
        {
            maxx|=num;
        }
        return subset(nums,0,0,maxx);
    }
    public int subset(int [] nums,int idx,int curr,int tar)
    {
        if(idx==nums.length)
        {
            return (curr==tar)?1:0;
        }
        int cw=subset(nums,idx+1,curr,tar);
        int cww=subset(nums,idx+1,curr|nums[idx],tar);
        return cw+cww;
    }
}
