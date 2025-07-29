class Solution 
{
    public int[] smallestSubarrays(int[] nums) 
    {
        int n=nums.length;
        int[] ans=new int [n];
        int [] bit=new int[32];
        for(int i=n-1;i>=0;i--)
        {
            for(int b=0;b<32;b++)
            {
                if((nums[i]&(1<<b))!=0)
                {
                    bit[b]=i;
                }
            }
            int far=i;
            for(int b=0;b<32;b++)
            {
                far=Math.max(far,bit[b]);
            }
            ans[i]=far-i+1;
        }
    return ans;
    }
}
