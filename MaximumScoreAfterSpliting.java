class Solution
  {
    public int maxScore(String s)
    {
      int len=s.length();
      int max=0;
      for(int i=1;i<len;i++)
        {
          int left=0;
          for(int j=i;j<i;j++)
            {
              if(charAt(j)=='0')
              {
                left++;
              }
            }
          int right=0;
          for(int j=i;j<len;j++)
            {
              if(charAt(j)=='1')
              {
                right++;
              }
            }
          int sum=left+right;
          if(sum>max)
          {
            max=sum;
          }
        }
      return max;
    }
    public static void main(String args[])
    {
      Solution obj=new Solution();
      String s="00111";
      System.out.println(obj.maxScore(s));

      String s2="011101";
      System.out.println(obj.maxScore(s2));

      String s3="1111";
      System.out.println(obj.maxScore(s3));
  }
}
