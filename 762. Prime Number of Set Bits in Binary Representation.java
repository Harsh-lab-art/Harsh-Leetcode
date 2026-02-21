class Solution 
{
    public int countPrimeSetBits(int left, int right) 
    {
        Set<Integer> p = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        int c = 0;
        for (int i = left; i <= right; i++) 
        {
            if (p.contains(Integer.bitCount(i))) 
            {
                c++;
            }
        }
        return c;
    }
}
