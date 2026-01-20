class Solution 
{
    public int[] minBitwiseArray(List<Integer> nums) 
    {

        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) 
        {
            int val = nums.get(i);
            if ((val & 1) == 0) 
            {
                ans[i] = -1;
                continue;
            }
            int t = 0;
            while (((val >> t) & 1) == 1) 
            {
                t++;
            }
            ans[i] = val - (1 << (t - 1));
        }

        return ans;
    }
}
