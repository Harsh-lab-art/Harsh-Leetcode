class Solution 
{
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int lc=0;
        int gc=0;
        int pc=0;
        for(int num:nums)
        {
            if(num<pivot)
            {
                lc++;
            }
            else if(num>pivot)
            {
                gc++;
            }
            else{
                pc++;
            }
        }
        int i=0;
        int j=lc;
        int k=lc+pc;
        int []res=new int[nums.length];
        for(int num:nums)
        {
            if(num<pivot)
            {
                res[i]=num;
                i++;
            }
            else if(num>pivot)
            {
                res[k]=num;
                k++;
            }
            else{
                res[j]=num;
                j++;
            }
        }
        return res;
    }
}
