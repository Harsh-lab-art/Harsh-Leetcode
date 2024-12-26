class Solution
  {
    public int findSum(int[]nums,int target)
    {
      return ways(nums,target,0,0);
    }
    public int ways(int[] nums,int target,int idx,int curr)
    {
      if(idx==nums.length)
      {
        return curr==target?1:0;
      }
      int add=ways(nums,target,idx+1,curr+nums[idx]);
      int sub=ways(nums,target,idx+1,curr-nums[idx]);
      return add+sub;
    }
    public static void main(String []args)
    {
      Solution obj=new Solution();
      int []arr={1,1,1,1,1};
      int target=3;
      System.out.println(obj.findSums(arr,target));

      int []arr2={1};
      int target2=1;
      System.out.println(obj.findSum(arr2,target2));
    }
  }
