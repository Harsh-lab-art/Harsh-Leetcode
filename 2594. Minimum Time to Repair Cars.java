class Solution 
{
    public long repairCars(int[] ranks, int cars) 
    {
        long st=Integer.MAX_VALUE;
        long en=Integer.MIN_VALUE;
        for(int rank:ranks)
        {
            en=Math.max(en,rank);
            st=Math.min(st,rank);
            
        }
        en=en*cars*cars;
        long ans=0;
        while(st<=en)
        {
            long mid=st+(en-st)/2;
            if(iscars(mid,ranks,cars))
            {
                ans=mid;
                en=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return ans;
    }
    public boolean iscars(long time,int ranks[],int repair)
    {
        int carepair=0;
        for(int rank:ranks)
        {
            carepair+=(long)(Math.sqrt((1*time)/rank));
            if(carepair>=repair)
            return true;
        }
        return false;
    }
}
