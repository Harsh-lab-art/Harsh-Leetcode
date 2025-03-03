class Solution 
{
    public int firstCompleteIndex(int[] arr, int[][] mat) 
    {
        int n=mat.length;
        int m=mat[0].length;
        int rc[]=new int[n];
        int cc[]=new int[m];
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int tc=n*m;
        for(int i=0;i<tc;i++)
        {
            int c[]=map.get(arr[i]);
            rc[c[0]]++;
            cc[c[1]]++;
            if(rc[c[0]]==m||cc[c[1]]==n)
            {
                return i;
            }
        }
        return -1;
    }
}
