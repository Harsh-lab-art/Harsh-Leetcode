class Solution 
{
    public int[] queryResults(int limit, int[][] queries) 
    {
        HashMap<Integer,Integer>colormap=new HashMap<>();
        HashMap<Integer,Integer>ballmap=new HashMap<>();
        int n=queries.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int ball=queries[i][0];
            int color=queries[i][1];
            if(!ballmap.containsKey(ball))
            {
                ballmap.put(ball,color);
                colormap.put(color,colormap.getOrDefault(color,0)+1);
            }
            else
            {
                int oldcolor=ballmap.get(ball);
                colormap.put(oldcolor,colormap.get(oldcolor)-1);
                if(colormap.get(oldcolor)==0)
                {
                    colormap.remove(oldcolor);
                }
                ballmap.put(ball,color);
                colormap.put(color,colormap.getOrDefault(color,0)+1);
            }
            res[i]=colormap.size();
        }
        return res;
    }
}
