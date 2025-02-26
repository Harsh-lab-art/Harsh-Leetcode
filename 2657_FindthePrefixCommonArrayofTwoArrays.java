class Solution 
{
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n=A.length;
        boolean[] a=new boolean[n+1];
        boolean[] b=new boolean[n+1];
        int []c=new int[n];
        int cc=0;
        for(int i=0;i<n;i++)
        {
            a[A[i]]=true;
            b[B[i]]=true;
            if(a[B[i]])
            {
                cc++;
            }
            if(A[i]!=B[i] && b[A[i]])
            {
                cc++;
            }
            c[i]=cc;
        }
        return c;
    }
}
