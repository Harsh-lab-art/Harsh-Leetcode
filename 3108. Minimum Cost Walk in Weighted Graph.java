class union
{
    int r[];
    int p[];
    union(int n)
    {
        r=new int[n];
        p=new int[n];
        for(int i=0;i<n;i++)
        {
            p[i]=i;
        }
    }
    public int find(int node)
    {
        if(node==p[node])
        {
            return node;
        }
        p[node]=find(p[node]);
        return p[node];
    }
    public void mix(int node1,int node2)
    {
        int root1=find(node1);
        int root2=find(node2);
        if(root1==root2)
        {
            return;
        }
        if(r[root1]<r[root2])
        {
            p[root1]=root2;
        }
        else if(r[root2]<r[root1])
        {
            p[root2]=root1;
        }
        else
        {
            p[root2]=root1;
            r[root1]++;
        }
    }
}
class Solution 
{
    public int[] minimumCost(int n, int[][] edges, int[][] query) 
    {
        union un=new union(n);
        for(int edge[]:edges)
        {
            un.mix(edge[0], edge[1]);
        }
        int cost[]=new int [n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        for(int edge[]:edges)
        {
            int rp=un.find(edge[0]);
            cost[rp]=cost[rp] & edge[2];
        }
        int m=query.length;
        int res[]=new int[m];
        for(int i=0;i<m;i++)
        {
            int root1=un.find(query[i][0]);
            int root2=un.find(query[i][1]);
            if(root1!=root2)
            {
                res[i]=-1;
            }
            else
            {
                res[i]=cost[root2];
            }
        }
        return res;
    }
}
