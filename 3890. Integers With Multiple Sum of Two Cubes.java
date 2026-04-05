class Solution 
{
    public List<Integer> findGoodIntegers(int n) 
    {
        Map<Integer,Integer>map=new HashMap<>();
        int lim=(int)Math.cbrt(n);
        for(int a=1;a<=lim;a++)
            {
                for(int b=a;b<=lim;b++)
                    {
                        int s=a*a*a+b*b*b;
                        if(s>n)
                            break;
                        map.put(s,map.getOrDefault(s,0)+1);
                    }
            }
        List<Integer>res=new ArrayList<>();
        for(int k:map.keySet())
            {
                if(map.get(k)>=2)
                {
                    res.add(k);
                }
            }
        Collections.sort(res);
        return res;
    }
}
