class Solution 
{
    public String shiftingLetters(String s, int[][] shifts) 
    {
        int n=s.length();
        int[]arr=new int[n+1];
        for(int []shift:shifts )
        {
            int st=shift[0];
            int end=shift[1];
            int dir=shift[2];
            if(dir==1)
            {
                arr[st]+=1;
                arr[end+1]-=1;
            }
            else
            {
                arr[st]-=1;
                arr[end+1]+=1;
            }
        }
        int[]netshift=new int[n];
        int shift=0;
        for(int i=0;i<n;i++)
        {
            shift+=arr[i];
            netshift[i]=shift;
        }
        char[]res=s.toCharArray();
        for(int i=0;i<n;i++)
        {
            int newCh=(res[i]-'a'+netshift[i])%26;
            if(newCh<0)
            {
                newCh+=26;
            }
            res[i]=(char)('a'+newCh);
        }
        return new String(res);   
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        String s="abc";
        int[][]arr={{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(obj.shiftingLetters(s,arr));

        String t="dztz";
        int[][]aar={{0,0,0},{1,1,1}};
        System.out.println(obj.shiftingLetters(t,aar));
    }
}
