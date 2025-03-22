class Solution 
{
    public int maxAbsoluteSum(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int curr=0;
        int currn=0;
        for(int num:nums)
        {
            curr+=num;
            max=Math.max(max,curr);
            if(curr<0)
            {
                curr=0;
            }
            currn+=num;
            min=Math.min(min,currn);
            if(currn>0)
            {
                currn=0;
            }
        }
        return Math.max(max,Math.abs(min));
    }
}
