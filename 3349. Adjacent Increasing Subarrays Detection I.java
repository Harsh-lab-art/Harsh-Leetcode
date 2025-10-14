class Solution 
{
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) 
    {
        int n = nums.size();
        for (int i = 0; i + 2 * k <= n; i++) 
        {
            boolean firstIncreasing = true;
            boolean secondIncreasing = true;
            for (int j = i; j < i + k - 1; j++) 
            {
                if (nums.get(j) >= nums.get(j + 1)) 
                {
                    firstIncreasing = false;
                    break;
                }
            }
            for (int j = i + k; j < i + 2 * k - 1; j++) 
            {
                if (nums.get(j) >= nums.get(j + 1)) 
                {
                    secondIncreasing = false;
                    break;
                }
            }
            if (firstIncreasing && secondIncreasing) 
            {
                return true;
            }
        }
        return false;
    }
}
