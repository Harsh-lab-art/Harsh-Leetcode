class Solution 
{
    public int countVowelSubstrings(String word) 
    {
        int c=0;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String sub=word.substring(i,j);
                if(only(sub) && total(sub))
                {
                    c++;
                }
            }
        }
        return c;
    }
    public boolean only(String str)
    {
        for(char c:str.toCharArray())
        {
            if("aeiou".indexOf(c)==-1)
            {
                return false;
            }
        }
        return true;
    }
    public boolean total(String str)
    {
        return str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u");
    }
}
