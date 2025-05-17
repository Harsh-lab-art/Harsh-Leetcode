class Solution 
{
    public String addBinary(String a, String b) 
    {
       StringBuilder res=new StringBuilder();
       int i=a.length()-1;
       int j=b.length()-1;
       int c=0;
       while(i>=0||j>=0||c!=0)
       {
        int d=(i>=0)?a.charAt(i)-'0':0;
        int e=(j>=0)?b.charAt(j)-'0':0;
        int sum=d+e+c;
        res.append(sum%2);
        c=sum/2;
        i--;
        j--; 
    }
    return res.reverse().toString();
    }
}
