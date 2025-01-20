class Solution 
{
    public int numSquares(int n) 
    {
         int[] arr=new int[n+1];
         for(int i=1;i<=n;i++)
         {
            arr[i]=n+1;
         }
         arr[0]=0;
         for(int i=1;i<=n;i++)
         {
            for(int j=1;j*j<=i;j++)
            {
                arr[i]=Math.min(arr[i],arr[i-j*j]+1);
            }
         }
         return arr[n];
    }
}
