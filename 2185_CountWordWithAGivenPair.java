class Solution 
{
    public int prefixCount(String[] words, String pref) 
    {
        int c=0;
        for(String word:words)
        {
            if(word.startsWith(pref))
            {
                c++;
            }
        }
        return c; 
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        String []s={"pay","attention","practice","attend"};
        String pr="at";
        String []x={"leetcode","win","loops","success"};
        String pre="code";
        System.out.println(obj.prefixCount(s,pr));
        System.out.println(obj.prefixCount(x,pre));


    }
}
