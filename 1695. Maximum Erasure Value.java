class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        HashSet<Integer>set=new HashSet<>();
        int l=0;
        int curr=0;
        int sum=0;
        int r=0;
        while(r<nums.length)
        {
            while(set.contains(nums[r]))
            {
                set.remove(nums[l]);
                curr=curr-nums[l];
                l++;
            }
            set.add(nums[r]);
            curr=curr+nums[r];
            sum=Math.max(sum,curr);
            r++;
        }
        return sum;
    }
}
