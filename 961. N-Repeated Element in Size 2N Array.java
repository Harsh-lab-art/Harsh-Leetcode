class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
        HashSet<Integer> rep=new HashSet<>();
        for (int x:nums)
        {
            if(rep.contains(x))
            {
                return x;
            }
            rep.add(x);
        }
        return -1;
    }
}
