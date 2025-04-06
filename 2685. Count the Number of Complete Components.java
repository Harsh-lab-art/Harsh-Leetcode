class Solution 
{
    public int countCompleteComponents(int n, int[][] edges) 
    {
        Dsu dsu=new Dsu(n);
        Map<Integer,Integer>edc=new HashMap<>();
        for(int[]edge:edges)
        {
            dsu.union(edge[0],edge[1]);
        }
        for(int[]edge:edges)
        {
            int root=dsu.find(edge[0]);
            edc.put(root,edc.getOrDefault(root,0)+1);
        }
        int comp=0;
        for(int v=0;v<n;v++)
        {
            if(dsu.find(v)==v)
            {
                int nc=dsu.s[v];
                int ee=(nc*(nc-1))/2;
                if(edc.getOrDefault(v,0)==ee)
                {
                    comp++;
                }
            }
        }
        return comp;
    }
    class Dsu
    {
        int[] p;
        int[] s;
        Dsu(int n)
        {
            p=new int[n];
            s=new int[n];
            for(int i=0;i<n;i++)
            {
                p[i]=i;
            }
            Arrays.fill(s,1);
        }
        int find(int node)
        {
            if(p[node]==node)
            {
                return node;
            }
            p[node]=find(p[node]);
            return p[node];
        }
        void union(int node1,int node2)
        {
            int root1=find(node1);
            int root2=find(node2);
            if(root1==root2)
            {
                return;
            }
            if(s[root1]>s[root2])
            {
                p[root2]=root1;
                s[root1]+=s[root2];
            }
            else
            {
                p[root1]=root2;
                s[root2]+=s[root1];
            }
        }
    }
}
