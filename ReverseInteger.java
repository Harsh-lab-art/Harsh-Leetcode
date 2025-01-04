class Solution 
{
    public int reverse(int x) 
    {
        int rev=0;
        int s=x<0?-1:1;
        x=Math.abs(x);
        while(x!=0)
        {
            int d=x%10;
            x/=10;
            if(rev>(Integer.MAX_VALUE - d)/10)
            {
                return 0;
            }
            rev=rev*10+d;
        }
        return s*rev;
        
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        System.out.println(obj.reverse(123));
        System.out.println(obj.reverse(-123));
        System.out.println(obj.reverse(120));

    }
}
