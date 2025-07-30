class Solution 
{
    public int longestSubarray(int[] nums) 
    {
        int m=0;
        for(int num:nums)
        {
            m=Math.max(m,num);
        }
        int l=0;
        int curr=0;
        for(int num:nums)
        {
            if(num==m)
            {
                curr++;
                l=Math.max(l,curr);
            }
            else
            {
                curr=0;
            }
        }
        return l;
    }
}
