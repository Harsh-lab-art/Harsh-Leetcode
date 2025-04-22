class Solution 
{
    public boolean digitCount(String num) 
    {
        int n=num.length();
        int []arr=new int[10];
        int dig;
        for(int i=0;i<n;i++)
        {
            dig=num.charAt(i)-'0';
            arr[dig]++;
        }
        for(int i=0;i<n;i++)
        {
            int found=num.charAt(i)-'0';
            if(arr[i]!=found)
            {
                return false;
            }
        }
        return true;
    }
}
