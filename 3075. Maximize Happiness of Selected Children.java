class Solution 
{
    public long maximumHappinessSum(int[] happiness, int k) 
    {
        Arrays.sort(happiness);
        long ans=0;
        int n=happiness.length;
        for(int i=0;i<k;i++)
        {
            int v=happiness[n-1-i]-i;
            if(v>0)
            {
                ans+=v;
            }
        }
        return ans;

    }
}
