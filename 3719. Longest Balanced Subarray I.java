class Solution 
{
    public int longestBalanced(int[] nums) 
    {
        int maxlen=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            Set<Integer> evens=new HashSet<>();
            Set<Integer> odds=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                int val=nums[j];
                if(val%2==0)
                {
                    evens.add(val);
                }
                else
                {
                    odds.add(val);
                }
                if(evens.size()==odds.size())
                {
                    maxlen=Math.max(maxlen, j-i+1);
                }
            }
        }
        return maxlen;
    }
}
