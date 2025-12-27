class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        String ans="";
        while(columnNumber>0)
        {
            columnNumber--;
            char ch=(char)('A'+columnNumber%26);
            ans=ch+ans;
            columnNumber/=26;
        }
        return ans;
    }
}
