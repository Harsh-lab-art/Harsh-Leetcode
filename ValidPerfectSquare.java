class Solution
{
    public boolean isPerfectSquare(int num) 
    {
      int l=1,r=num;
      while(l<=r)
      {
         int mid=l+(r-l)/2;
         long sq=(long)mid*mid;
         if(sq==num)
         {
            return true;
         }
         else if(sq<num)
         {
            l=mid+1;
         }
         else
         {
            r=mid-1;
         }
      }
      return false;
    }
} 
