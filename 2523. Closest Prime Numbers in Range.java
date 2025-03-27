class Solution 
{
    public int[] closestPrimes(int left, int right) 
    {
        boolean prime[]=new boolean[right+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int p=2;p*p<=right;p++)
        {
            if(prime[p])
            {
                for(int i=p*p;i<=right;i+=p)
                prime[i]=false;
            }
        }
        int res[]=new int[]{-1,-1};
        int minDiff=Integer.MAX_VALUE;
        int prev=-1;
        for(int i=left;i<=right;i++)
        {
            if(prime[i])
            {
                if(prev==-1)
                {
                    prev=i;
                }
                else{
                    if(i-prev<minDiff)
                    {
                        res[0]=prev;
                        res[1]=i;
                        minDiff=i-prev;
                    }
                    prev=i;
                }
            }
        }
        return res;
    }
    public static void main(String []args)
    {
        Solution obj=new Solution();
        System.out.println(obj.closestPrimes(10,19));
        System.out.println(obj.closestPrimes(4,6));
    }
}
