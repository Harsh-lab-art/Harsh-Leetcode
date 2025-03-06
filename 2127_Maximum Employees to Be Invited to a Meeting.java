class Solution 
{
    public int maximumInvitations(int[] favorite) 
    {
        int n=favorite.length;
        int longest=0;
        ArrayList<int[]>twocycle=new ArrayList<>();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i]) 
            {
                continue;
            }
            HashSet<Integer>set=new HashSet<>();
            int start=i;
            int cur=i;
            while(!vis[cur])
            {
                vis[cur]=true;
                set.add(cur);
                cur=favorite[cur];
            }
            int len=set.size();
            while(start!=cur)
            {
                len--;
                start=favorite[start];
            }
            longest=Math.max(longest,len);
            if(len==2)
            {
                twocycle.add(new int[]{cur,favorite[cur]});
            }
        }
        List<List<Integer>>revList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            revList.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            revList.get(favorite[i]).add(i);
        }
        int max2=0;
        for(int arr[]:twocycle)
        {
            max2+=f(arr[0],arr[1],revList)+f(arr[1],arr[0],revList) +2;
        }
        return Math.max(max2,longest);
    }
    public int f(int node,int skip,List<List<Integer>>revList)
    {
        int len=0;
        Queue<int[]>queue=new LinkedList<>();
       // queue.offer(node);
       queue.offer(new int[]{node,0});
        while(!queue.isEmpty())
        {
            int cur[]=queue.poll();
            len=Math.max(len,cur[1]);
            for(int neigh:revList.get(cur[0]))
            {
                if(neigh==skip)
                {
                    continue;
                }
                queue.offer(new int[]{neigh,cur[1]+1});
            }
        }
        return len;
    }
}
