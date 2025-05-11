class Solution 
{
    public boolean strongPasswordCheckerII(String password) 
    {
        if(password.length()<8)
        return false;
        boolean lower=false,upper=false,dig=false,special=false;
        String spechar="!@#$%^&*()-+";
        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);
            if(i>0 && ch==password.charAt(i-1))
            return false;
            else if(Character.isLowerCase(ch))
            lower=true;
            else if(Character.isUpperCase(ch))
            upper=true;
            else if(Character.isDigit(ch))
            dig=true;
            else if(spechar.indexOf(ch)!=-1)
            special=true;
        }
        return lower && upper && dig && special;
    }
}
