class Solution 
{
    public int maximumLength(int[] nums, int k) 
    {
        int n= nums.length;
        int[][] arr=new int[n][k];
        int res=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                arr[i][j]=1;
            }
            for(int a=0;a<i;a++)
            {
                int mod=(nums[a]+nums[i]) % k;
                arr[i][mod]=Math.max(arr[i][mod],arr[a][mod]+1);
                res=Math.max(res,arr[i][mod]);
            }
        }
        return res;
    }
}
