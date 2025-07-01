class Solution 
{
    public int possibleStringCount(String word) 
    {
        int n = word.length();
        int res=1;
        for(int i=0;i<n;)
        {
            int j=i;
            while(j<n && word.charAt(i)==word.charAt(j))
            {
                j++;
            }
            int len=j-i;
            if(len >1)
            {
                res+=(len-1);
            }
            i=j;
        }
        return res;
    }
}
