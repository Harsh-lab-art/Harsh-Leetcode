import java.util.ArrayList;
import java.util.List;
class Solution 
{
    public int[] vowelStrings(String[] words, int[][] queries) 
    {
        int n=words.length;
        int[] sum=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(isVowel(words[i]))
            {
                sum[i+1]=sum[i]+1;
            }
            else{
                sum[i+1]=sum[i];
            }
        }
        int []ans=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int l=queries[i][0];
            int r=queries[i][1];
            ans[i]=(sum[r+1]-sum[l]);
        }
        return ans;
    }
    public boolean isVowel(String word)
    {
        if(word.isEmpty())
        {
            return false;
        }
        char st=word.charAt(0);
        char ls=word.charAt(word.length()-1);
        return Vowel(st) && Vowel(ls);
    }
    public boolean Vowel(char c)
    {
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
