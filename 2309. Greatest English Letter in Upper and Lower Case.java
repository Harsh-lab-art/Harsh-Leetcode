class Solution 
{
    public String greatestLetter(String s) 
    {
        for(char ch='Z';ch>='A';ch--)
        {
            if(s.indexOf(ch)!=-1 && s.indexOf(Character.toLowerCase(ch))!=-1)
            {
                return String.valueOf(ch);
            }
        }
        return "";   
    }
}
