class Solution 
{
    public int magnificentSets(int n, int[][] edges) 
    {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int[]edge:edges)
        { 
            adj.get(edge[0]-1).add(edge[1]-1);
            adj.get(edge[1]-1).add(edge[0]-1);
        }
        int[] color=new int [n];
        for(int node=0;node<n;node++)
        {
            if(color[node]!=0) 
            continue;
            color[node]=1;
            if(!is(adj,node,color))
            return -1;
        }
        int[]dist=new int[n];
        for(int node=0;node<n;node++)
        {
            dist[node]=getLong(adj,node,n);
        }
        int max=0;
        boolean[] visit=new boolean[n];
        for(int node=0;node<n;node++)
        {
            if(visit[node])
            continue;
            max+=getget(adj,node,dist,visit);
        }
        return max;
    }
    public boolean is(ArrayList<ArrayList<Integer>>adj,int node,int[]color)
    {
        for(int neigh:adj.get(node))
        {
            if(color[neigh]==color[node])
            return false;
            if(color[neigh]!=0)
            continue;
            color[neigh]=-1*(color[node]);
            if(!is(adj,neigh,color))
            return false;
        }
        return true;
    }
    public int getLong(ArrayList<ArrayList<Integer>>adj,int src,int n)
    {
        Queue<Integer>queue=new LinkedList<Integer>();
        boolean[]visit=new boolean[n];
        queue.add(src);
        visit[src]=true;
        int dist=0;
        while(!queue.isEmpty())
        {
            int layer=queue.size();
            for(int i=0;i<layer;i++)
            {
                int curr=queue.poll();
                for(int neigh:adj.get(curr))
                {
                    if(visit[neigh])
                    continue;
                    visit[neigh]=true;
                    queue.add(neigh);
                }
            }
            dist++;
        }
        return dist;
    }
    public int getget(ArrayList<ArrayList<Integer>> adj,int node, int[] dist,boolean[]visit)
    {
        int max=dist[node];
        visit[node]=true;
        for(int neigh:adj.get(node))
        {
            if(visit[neigh])
            continue;
            max=Math.max(max,getget(adj,neigh,dist,visit));
        }
        return max;
    }
}
