class Solution 
{
    public int lenLongestFibSubseq(int[] arr) 
    {
        int n=arr.length;
        int dp[][]=new int[n][n];
        int maxlen=0;
        for(int cur=2;cur<n;cur++)
        {
            int st=0;
            int end=cur-1;
            while(st<end)
            {
                int sum=arr[st]+arr[end];
                if(sum<arr[cur])
                {
                    st++;
                }
                else if(sum>arr[cur])
                {
                    end--;
                }
                else
                {
                    dp[end][cur]=dp[st][end]+1;
                    maxlen=Math.max(maxlen,dp[end][cur]);
                    st++;
                    end--;
                }
            }
        }
        return (maxlen==0)?0:maxlen+2;
    }
}
