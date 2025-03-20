class Solution 
{
    StringBuilder res;
    public String findDifferentBinaryString(String[] nums) 
    {
        int n=nums.length;
        HashSet<String> set=new HashSet<>();
        for(String num:nums)
        {
            set.add(num);
        }
        res=new StringBuilder("");
        backtrack(nums,n,set,res);
        return res.toString();
    }
    public boolean backtrack(String nums[],int n,HashSet<String>set,StringBuilder res)
    {
        if(res.length()==n)
        {
            if(!set.contains(res.toString()))
            {
                return true;
            }
            return false;
        }
        for(char ch='0';ch<='1';ch++)
        {
            res.append(ch);
            if(backtrack(nums,n,set,res))
            {
                return true;
            }
            res.deleteCharAt(res.length()-1);
        }
        return false;
    }
    public static void main(String[]args)
    {
        Solution obj=new Solution();
        String[] nums={"01","10"};
        System.out.println(obj.findDifferentBinaryString(nums));
    }
}
