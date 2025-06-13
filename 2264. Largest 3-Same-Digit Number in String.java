class Solution 
{
    public String largestGoodInteger(String num) 
    {
        String maxx="";
        for(int i=0;i<=num.length()-3;i++)
        {
            char a=num.charAt(i);
            char b=num.charAt(i+1);
            char c=num.charAt(i+2);
            if(a==b && b==c)
            {
                String curr=""+a+b+c;
                if(maxx.compareTo(curr)<0)
                {
                    maxx=curr;
                }
            }
        }
        return maxx;
    }
}
