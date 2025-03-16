class Solution 
{
    public int tupleSameProduct(int[] nums) 
    {
        HashMap<Integer,Integer>product=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int res=nums[i]*nums[j];
                product.put(res,product.getOrDefault(res,0)+1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>entry:product.entrySet())
        {
            int prod=entry.getKey();
            int count=entry.getValue();
            if(count>=2)
            {
                int comb=(count*(count-1))/2;
                ans=ans+comb*8;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int[]arr={2,3,4,6};
        System.out.println(obj.tupleSameProduct(arr));
    }
}
       
