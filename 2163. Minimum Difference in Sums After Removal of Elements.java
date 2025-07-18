class Solution 
{
    public long minimumDifference(int[] nums) 
    {
        int n = nums.length / 3;
        int len = nums.length;
        long[] leftSum = new long[len];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long leftTotal = 0;
        for (int i = 0; i < len; i++) 
        {
            maxHeap.add(nums[i]);
            leftTotal += nums[i];

            if (maxHeap.size() > n) 
            {
                leftTotal -= maxHeap.poll();
            }

            if (maxHeap.size() == n) 
            {
                leftSum[i] = leftTotal;
            } else {
                leftSum[i] = Long.MAX_VALUE;
            }
        }
        long minDiff = Long.MAX_VALUE;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long rightTotal = 0;
        for (int i = len - 1; i >= 0; i--) 
        {
            minHeap.add(nums[i]);
            rightTotal += nums[i];

            if (minHeap.size() > n) 
            {
                rightTotal -= minHeap.poll();
            }

            if (minHeap.size() == n && i > 0) 
            {
                minDiff = Math.min(minDiff, leftSum[i - 1] - rightTotal);
            }
        }
        return minDiff;
    }
}
