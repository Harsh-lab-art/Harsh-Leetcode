class Solution 
{
    public int maximumCandies(int[] candies, long k) 
    {
        long total=0;
        for(int can:candies)
        {
            total+=can;
        }
        if(total<k)
        {
            return 0;
        }
        int l=0;
        int r=(int)(total/k);
        while(l<r)
        {
            int mid=(l+r+1)/2;
            long c=0;
            for(int can:candies)
            {
                c+=can/mid;
            }
            if(c>=k)
            {
                l=mid;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
}
