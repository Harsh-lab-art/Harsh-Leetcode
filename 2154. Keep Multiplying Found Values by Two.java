class Solution 
{
    public int findFinalValue(int[] nums, int original) 
    {
        boolean found;
        do
        {
            found=false;
            for(int num:nums)
            {
                if(num==original)
                {
                    original*=2;
                    found=true;
                    break;
                }
            }
        }
        while(found);
        return original;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int arr[]={5,3,6,1,12};
        int k=3;
        int res=obj.findFinalValue(arr, k);
        System.out.println(res);

        int ar[]={8,19,4,2,15,3};
        int m=2;
        int re=obj.findFinalValue(ar, m);
        System.out.println(re);
    }
}
