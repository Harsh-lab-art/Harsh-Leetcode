class Solution 
{
    public double new21Game(int n, int k, int maxPts) 
    {
        if (k == 0 || n >= k + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double wSum = 1.0; 
        double res = 0.0;

        for (int i = 1; i <= n; i++) 
        {
            dp[i] = wSum / maxPts;

            if (i < k) 
            {
                wSum += dp[i];
            } 
            else 
            {
                res += dp[i];
            }

            if (i - maxPts >= 0) 
            {
                wSum -= dp[i - maxPts];
            }
        }
        return res;
    }
}
