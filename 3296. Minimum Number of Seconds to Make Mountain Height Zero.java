class Solution 
{
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) 
    {
        long low = 1;
        long high = 0;
        for (int w : workerTimes) high = Math.max(high, (long)w);
        high = high * mountainHeight * (mountainHeight + 1) / 2;
        long ans = high;
        while (low <= high) 
        {
            long mid = low + (high - low) / 2;
            if (canReduce(mountainHeight, workerTimes, mid)) 
            {
                ans = mid;
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    private boolean canReduce(int targetHeight, int[] workerTimes, long timeLimit) 
    {
        long totalHeightReduced = 0;
        for (int w : workerTimes) 
        {
            long x = (long)((-1 + Math.sqrt(1 + 8.0 * timeLimit / w)) / 2);
            totalHeightReduced += x;
            if (totalHeightReduced >= targetHeight) return true;
        }
        return totalHeightReduced >= targetHeight;
    }
}
