class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int freq[]=new int[3];
        int co=0;
        int curr=0;
        int l=0;
        int n=s.length();
        for(int r=0;r<n;r+=1)
        {
            char ch=s.charAt(r);
            freq[ch-'a']+=1;
            if(freq[ch-'a']==1)
            {
                curr+=1;
            }
            while(curr==3)
            {
                co+=(n-r);
                char c=s.charAt(l);
                freq[c-'a']-=1;
                if(freq[c-'a']==0)
                {
                    curr-=1;
                }
                l+=1;
            }
        }
        return co;
    }
}
