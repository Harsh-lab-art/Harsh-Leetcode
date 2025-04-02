class Solution 
{
    public int minCapability(int[] nums, int k) 
    {
            int st=Integer.MAX_VALUE;
            int ed=Integer.MIN_VALUE;
            for(int num:nums)
            {
                if(num>ed)
                {
                    ed=num;
                }
                if(num<st)
                {
                    st=num;
                }
            }
            int ans=0;
            while(st<=ed)
            {
                int mid=st+(ed-st)/2;
                if(robbery(mid,nums,k))
                {
                    ans=mid;
                    ed=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
            return ans;
    }
    public boolean robbery(int rang,int nums[],int home)
    {
        int rob=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=rang)
            {
                rob++;
                i++;
            }
            if(rob>=home)
            return true;
        }
        return false;
    }
}
