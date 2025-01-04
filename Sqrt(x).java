class Solution 
{
    public static int mySqrt(int x) 
    {
      if(x<2)
      {
        return x;
      }
      int l=2;
      int r=x/2;
      while(l<=r)
      {
        int m=l+(r-l)/2;
        long ms=(long)m*m;
        if(ms==x)
        {
            return m;
        }
        else if(ms<x)
        {
            l=m+1;
        }
        else
        {
            r=m-1;
        }
      }
      return r;   
    }
    public static void main(String args[])
    {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }
}
