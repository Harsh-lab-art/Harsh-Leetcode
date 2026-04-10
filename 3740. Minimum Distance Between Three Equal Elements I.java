class Solution 
{
    public int minimumDistance(int[] nums) 
    {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            map.computeIfAbsent(nums[i], k->new ArrayList<>()).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for (List<Integer> list : map.values()) 
        {
            int size = list.size();
            if (size >= 3) 
            {
                for (int i = 0; i <= size - 3; i++) 
                {
                    int dist = 2 * (list.get(i + 2) - list.get(i));
                    ans = Math.min(ans, dist);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1:ans;
    }
}
