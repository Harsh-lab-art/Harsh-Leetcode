class Solution 
{
    public boolean reorderedPowerOf2(int n) 
    {
        String s=sortDigits(n);
        for(int i =0;i<31;i++)
        {
            int pow=1<<i;
            if(sortDigits(pow).equals(s))
            {
                return true;
            }
        }
        return false;
    }
    public String sortDigits(int n)
    {
        char[] arr=String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
