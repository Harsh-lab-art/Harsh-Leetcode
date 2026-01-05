class Solution 
{
    public long maxMatrixSum(int[][] matrix) 
    {
        long sum=0;
        int neg=0;
        int mina=Integer.MAX_VALUE;
        for(int[] row: matrix)
        {
            for(int val:row)
            {
                if(val<0){
                    neg++;
                }
                sum+=Math.abs(val);
                mina=Math.min(mina,Math.abs(val));
            }
        }
        if(neg%2==0)
        {
            return sum;
        }
        else
        {
            return sum-2L*mina;
        }
    }
}
