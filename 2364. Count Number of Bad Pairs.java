class Solution 
{
    public long countBadPairs(int[] nums) 
    {
        long n=nums.length;
        long goodpair=0;
        long totalpair=n*(n-1)/2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int val=i-nums[i];
            int prevcount=map.getOrDefault(val,0);
            goodpair+=prevcount;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return totalpair-goodpair;
    }
}
