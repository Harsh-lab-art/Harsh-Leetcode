class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2!=0)
        {
            return false;  
        }
        int count=0;
        int uncount=0;
        for(int i=0;i<s.length();i++)
        {
            if(locked.charAt(i)=='0')
            {
                uncount++;
            }
            else if(s.charAt(i)=='(')
            {
                count++;
            }
            else{
                if(count>0)
                {
                    count--;
                }
                else if(uncount>0)
                {
                    uncount--;
                }
                else{
                    return false;
                }
            }
        }
        int close=0;
        uncount=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(locked.charAt(i)=='0')
            {
                uncount++;
            }
            else if(s.charAt(i)==')')
            {
                close++;
            }
            else{
                if(close>0)
                {
                    close--;
                }
                else if(uncount>0)
                {
                    uncount--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}
