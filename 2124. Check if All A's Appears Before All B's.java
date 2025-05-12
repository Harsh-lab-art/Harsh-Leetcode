class Solution 
{
    public boolean checkString(String s) 
    {
        int lasta=s.lastIndexOf('a');
        int lastb=s.indexOf('b');
        return lasta<lastb || lastb==-1;
    }
}
