class Solution 
{
    public int minMirrorPairDistance(int[] nums) 
    {
        Map<Integer,Integer> pre=new HashMap<>();
        int n=nums.length;
        int ans=n+1;
        for(int i=0;i<n;i++)
        {
            int x=nums[i];
            if(pre.containsKey(x))
            {
                ans=Math.min(ans,i-pre.get(x));
            }
            pre.put(reverseNum(x),i);
        }
        return ans==n+1?-1:ans;
    }
    private int reverseNum(int x)
    {
        int y=0;
        while(x>0)
        {
            y=y*10+(x%10);
            x/=10;
        }
        return y;
    }
}
