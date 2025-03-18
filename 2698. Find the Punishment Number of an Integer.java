class Solution 
{
    public boolean ispart(int j,String i1,int i, int currs)
    {
        int n=i1.length();
        if(j==n)
        {
            return (currs==i);
        }
        for(int idx=j;idx<n;idx++)
        {
            int val=Integer.parseInt(i1.substring(j,idx+1));
            if(ispart(idx+1,i1,i,currs+val))
            {
                return true;
            }
        }
        return false;
    }
    public int punishmentNumber(int n) 
    {
          int res=0;
          for(int i=1;i<=n;i++)
          {
            String i1=Integer.toString(i*i);
            if(ispart(0,i1,i,0))
            {
                res+=(i*i);
            }
          }
        return res;
    }
}
