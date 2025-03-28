class Solution 
{
    public long countOfSubstrings(String word, int k) 
    {
        return least(k,word)-least(k+1,word);
    }
    public boolean isconso(char ch)
    {
        return (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u');
    }
    public boolean isvow(int freq[])
    {
        return (freq['a'-'a']>0 && freq['e'-'a']>0 && freq['i'-'a']>0 && freq['o'-'a']>0 && freq['u'-'a']>0);
    }
    public long least(int k,String words)
    {
        int c=0;
        int curr=0;
        int freq[]=new int[26];
        int n=words.length();
        int l=0;
        for(int r=0;r<n;r++)
        {
            char ch=words.charAt(r);
            if(isconso(ch))
            {
                curr++;
            }
            freq[ch-'a']++;
            while(curr>=k && isvow(freq))
            {
                c+=(n-r);
                char cr=words.charAt(l);
                if(isconso(cr))
                {
                    curr--;
                }
                freq[cr-'a']--;
                l++;
            }
        }
        return c;
    }
}
