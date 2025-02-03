import java.util.HashSet;
class Solution 
{
    public int countPalindromicSubsequence(String s) 
    {
      int n=s.length();
      int[]l=new int[26];
      int[]r=new int[26];
      HashSet<String>unique=new HashSet<>();
      for(char c:s.toCharArray())
      {
        r[c-'a']++;
      }
      for(int i=0;i<n;i++)
      {
        char mid=s.charAt(i);
        r[mid-'a']--;
        for(char c='a';c<='z';c++)
        {
            if(l[c-'a']>0 && r[c-'a']>0)
            {
                unique.add(""+c+mid+c);
            }
        }
        l[mid-'a']++;
      }
      return unique.size();   
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        String a="aabca";
        System.out.println(obj.countPalindromicSubsequence(a));

        String b="adc";
        System.out.println(obj.countPalindromicSubsequence(b));

        String c="bbcbaba";
        System.out.println(obj.countPalindromicSubsequence(c));
    }
    
    
}
