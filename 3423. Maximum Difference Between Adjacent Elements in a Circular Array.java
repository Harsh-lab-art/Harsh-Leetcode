class Solution 
{
    public int maxAdjacentDistance(int[] nums) 
    {
        int n=nums.length;
        int dist=0;
        for(int i=1;i<n;++i)
        {
            dist=Math.max(dist,Math.abs(nums[i]-nums[i-1]));
        }
        dist=Math.max(dist,Math.abs(nums[n-1]-nums[0]));
        return dist;
    }
}
