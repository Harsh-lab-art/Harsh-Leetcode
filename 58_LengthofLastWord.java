class Solution 
{
    public int lengthOfLastWord(final String s) 
    {
       boolean  f=false;
       int len=0;
       for(int i=s.length()-1;i>=0;i--)
       {
        if(Character.isLetter(s.charAt(i)))
        {
            f=true;
            len++;
        }
        else{
            if(f==true)
            {
                return len;
            }
        }
        
       }
       return len;
    }
} 
