class Solution 
{
    public int[] constructDistancedSequence(int n) 
    {
        boolean used[]=new boolean[n+1];
        int seq[]=new int[2*n-1];
        backtrack(0,used,seq,n);
        return seq;
    }
    public boolean backtrack(int idx,boolean used[],int seq[],int n)
    {
        while(idx<seq.length && seq[idx]!=0) idx++;
        if(idx==seq.length) return true;
        for(int i=n;i>=1;i--)
        {
            if(used[i]) continue;
            if(i==1)
            {
                seq[idx]=i;
                used[i]=true;
                if(backtrack(idx+1,used,seq,n)) return true;
                seq[idx]=0;
                used[i]=false;
            }
            else if(idx+i<seq.length && seq[idx+i]==0)
            {
                seq[idx]=i;
                seq[idx+i]=i;
                used[i]=true;
                if(backtrack(idx+1,used,seq,n)) return true;
                seq[idx]=0;
                seq[idx+i]=0;
                used[i]=false;
            }
        }
        return false;
    }
}
