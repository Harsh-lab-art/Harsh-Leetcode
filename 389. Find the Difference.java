class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        int ss=0;
        int tt=0;
        for(int ch:s.toCharArray())
        ss=ss+ch;
        for(int ch:t.toCharArray())
        tt=tt+ch;
        return (char)(tt-ss);
    }
}
