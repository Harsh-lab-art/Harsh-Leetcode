class Solution 
{
    String res;
    int count;
    public String getHappyString(int n, int k) 
    {
        count=0;
        res="";
        backtrack(n,k,new StringBuilder(""));
        return res;
    }
    public boolean backtrack(int n,int k,StringBuilder curr)
    {
        if(curr.length()==n)
        {
            count++;
            if(count==k)
            {
                res=curr.toString();
                return true;
            }
           return false; 
        }
        for(char ch='a';ch<='c';ch++)
        {
            int len=curr.length();
            if(len>0 && curr.charAt(len-1)==ch)
            continue;
            curr.append(ch);
            if(backtrack(n,k,curr))
            {
                return true;
            }
            curr.deleteCharAt(curr.length()-1);
        }
        return false;
    }
}
