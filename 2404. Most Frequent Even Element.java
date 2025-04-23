import java.util.HashMap;
class Solution 
{
    public int mostFrequentEven(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int mfreq=0;
        int res=-1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                map.put(num,map.getOrDefault(num,0)+1);
                int curr=map.get(num);
                if(curr>mfreq)
                {
                    mfreq=curr;
                    res=num;
                }
                else if(curr==mfreq && num<res)
                {
                    res=num;
                }
            }
        }
        return res;   
    }
}
