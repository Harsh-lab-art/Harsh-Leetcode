class Solution 
{
    public int maxScore(String s) 
    {
       int len=s.length();
       int max=0;
       for(int i=1;i<len;i++)
       {
         int left=0;
         for(int j=0;j<i;j++)
         {
            if(s.charAt(j)=='0')
            {
              left++;
            }
         }
         int right=0;
         for(int j=i;j<len;j++)
          {
            if(s.charAt(j)=='1')
            {
               right++;
            }
          }
         int sum=(left+right);
         if(sum>max)
          {
            max=sum;  
          }
        }
    return max;
  }
}
