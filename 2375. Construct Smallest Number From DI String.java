class Solution 
{
    public String smallestNumber(String pattern) 
    {
        int n=pattern.length();
        boolean[] used=new boolean[10];
        StringBuilder res=new StringBuilder();
        backtrack(pattern,0,new int[n+1],used,res);
        return res.toString();
    }
    public boolean backtrack(String pattern,int idx,int[]num,boolean[]used,StringBuilder res)
    {
        if(idx>pattern.length())
        {
            for(int i=0;i<num.length;i++)
            {
                res.append(num[i]);
            }
            return true;
        }
        for(int digit=1;digit<=9;digit++)
        {
            if(!used[digit] && (idx==0 || isvalid(num[idx-1],digit,pattern.charAt(idx-1))))
            {
                used[digit]=true;
                num[idx]=digit;
                if(backtrack(pattern,idx+1,num,used,res))
                {
                    return true;
                }
                num[idx]=0;
                used[digit]=false;
            }
        }
        return false;
    }
    public boolean isvalid(int last,int curr,char con)
    {
        return(con=='I' && last<curr) || (con=='D' && last>curr);
    }
}
