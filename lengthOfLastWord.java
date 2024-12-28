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
  public static void main(String args[])
  {
    Solution obj=new Solution();
    String s="Hello World";
    System.out.println(obj.lengthOfLastWord(s));
    String m="   fly me   to   the moon  ";
    System.out.println(obj.lengthOfLastWord(m));
    String n="luffy is still joyboy";
    System.out.println(obj.lengthOfLastWord(n));
  }
} 
