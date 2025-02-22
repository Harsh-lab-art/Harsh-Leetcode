import java.util.*;
class Solution
{
    public List<String> wordSubsets(String[] words1,String[] words2)
    {
        int[]maxfreq=new int[26];
        for(String word: words2)
        {
            int[]freq=getFrequency(word);
            for(int i=0;i<26;i++)
            {
                maxfreq[i]=Math.max(maxfreq[i],freq[i]);
            }
        }
        List<String>res=new ArrayList<>();
        for(String word:words1)
        {
            int[]freq=getFrequency(word);
            if(isUniversal(freq,maxfreq))
            {
                res.add(word);
            }
        }
        return res; 
    }
    public int[] getFrequency(String word)
    {
        int[] freq=new int[26];
        for(char c: word.toCharArray())
        {
            freq[c-'a']++;
        }
        return freq;
    }
    public boolean isUniversal(int[]freq,int[]maxfreq)
    {
        for(int i=0;i<26;i++)
        {
            if(freq[i]<maxfreq[i])
            {
                return false;
            }
        }
        return true;
    }
}
