class Solution 
{
    public String clearDigits(String s) 
    {
        Stack<Character>stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}
