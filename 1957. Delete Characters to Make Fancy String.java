class Solution
{
    public String makeFancyString(String s)
    {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int c=1;
        for(int i=0;i<n;i++)
        {
            if(i>0 && s.charAt(i)==s.charAt(i-1)
            {
                c++;
            }
            else
            {
                c=1;
            }
            if(c<3)
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString;
    }
}
             
            
