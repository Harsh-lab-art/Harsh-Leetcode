class Solution 
{
    public int maxStability(int n, int[][] edges, int k) 
    {
        int low=1,high=200000,ans=-1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (canAchieve(n, edges, k, mid)) 
            {
                ans = mid;
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return ans;
    }
    private boolean canAchieve(int n, int[][] edges, int k, int target) 
    {
        DSU dsu = new DSU(n);
        int mandatoryCount = 0;
        int usedEdges = 0;
        for (int[] e : edges) 
        {
            if (e[3] == 1) 
            {
                if (e[2] < target) return false;
                if (!dsu.union(e[0], e[1])) return false;
                mandatoryCount++;
                usedEdges++;
            }
        }
        for (int[] e : edges) 
        {
            if (e[3] == 0 && e[2] >= target) 
            {
                if (dsu.union(e[0], e[1])) 
                {
                    usedEdges++;
                }
            }
        }
        int upgradesUsed = 0;
        for (int[] e : edges) 
        {
            if (e[3] == 0 && e[2] < target && e[2] * 2 >= target) 
            {
                if (upgradesUsed < k) 
                {
                    if (dsu.union(e[0], e[1])) 
                    {
                        upgradesUsed++;
                        usedEdges++;
                    }
                }
            }
        }
        return usedEdges == n - 1;
    }
    class DSU 
    {
        int[] parent;
        DSU(int n) 
        {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int i) 
        {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }
        boolean union(int i, int j) 
        {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI != rootJ) 
            {
                parent[rootI] = rootJ;
                return true;
            }
            return false;
        }
    }
}
