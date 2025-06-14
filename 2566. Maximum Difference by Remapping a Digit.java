class Solution 
{
    public int minMaxDifference(int num) 
    {
         String s = Integer.toString(num);
        int max = num;
        int min = num;
        for (char ch = '0'; ch <= '9'; ch++) 
        {
            String replaced = s.replace(ch, '9');
            int val = Integer.parseInt(replaced);
            max = Math.max(max, val);
        }
        for (char ch = '1'; ch <= '9'; ch++) 
        {
            String replaced = s.replace(ch, '0');
            int val = Integer.parseInt(replaced);
            min = Math.min(min, val);
        }

        return max - min;
    }
}
