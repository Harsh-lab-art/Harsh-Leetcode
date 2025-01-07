class Solution 
{
    public int singleNumber(int[] nums) 
    {
      int res=0;
      for(int n:nums)
      {
        res=res^n;
      }
      return res;   
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int [] num={2,2,1};
        obj.singleNumber(num);
    }
}
