class Solution 
{
    public int peopleAwareOfSecret(int n, int delay, int forget) 
    {
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        
        for (int day = 2; day <= n; day++) 
        {
            for (int prevDay = 1; prevDay < day; prevDay++) 
            {
                if (prevDay + delay <= day && day < prevDay + forget) 
                {
                    dp[day] = (dp[day] + dp[prevDay]) % MOD;
                }
            }
        }
        long result = 0;
        for (int day = 1; day <= n; day++) 
        {
            if (day + forget > n) 
            {
                result = (result + dp[day]) % MOD;
            }
        }
        return (int) result;
    }
}
