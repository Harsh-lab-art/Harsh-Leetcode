class Solution 
{
    public char kthCharacter(int k) 
    {
        String word="a";
        while(word.length()<k)
        {
            String n="";
            for(int i=0;i<word.length();i++)
            {
                char ch=word.charAt(i);
                char next=(char)((ch=='z')?'a':ch+1);
                n+=next;
            }
            word=word+n;
        }
        return word.charAt(k-1);
    }
}
