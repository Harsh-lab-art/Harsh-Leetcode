import java.util.Collections;
class Solution 
{
    public long minCost(int[] basket1, int[] basket2) 
    {
        Map<Integer,Integer>freq=new TreeMap<>();
        int n=basket1.length;
        int minval=Integer.MAX_VALUE;
        for(int x: basket1)
        {
            freq.put(x,freq.getOrDefault(x,0)+1);
            minval=Math.min(minval,x);
        }
        for(int x :basket2)
        {
            freq.put(x,freq.getOrDefault(x,0)-1);
            minval=Math.min(minval,x);
        }
        List<Integer>excess=new ArrayList<>();
        for(int x:freq.keySet())
        {
            int f=freq.get(x);
            if(f%2!=0)
            return-1;
            for(int i=0;i<Math.abs(f)/2;i++)
            {
                excess.add(x);
            }
        }
        Collections.sort(excess);
        long cost=0L;
        int m=excess.size();
        for(int i=0;i<m/2;i++)
        {
            cost+=Math.min(excess.get(i),2*minval);
        }
        return cost;
    }
}
