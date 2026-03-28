class Solution 
{
    public String findTheString(int[][] lcp) 
    {
        int n = lcp.length;
        for (int i = 0; i < n; i++) 
        {
            if (lcp[i][i] != n - i) 
            return "";
            for (int j = 0; j < n; j++) 
            {
                if (lcp[i][j] != lcp[j][i]) 
                return "";
            }
        }
        DSU dsu = new DSU(n);
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (lcp[i][j] > 0) 
                {
                    dsu.union(i, j);
                }
            }
        }
        char[] res = new char[n];
        Map<Integer, Character> map = new HashMap<>();
        char ch = 'a';

        for (int i = 0; i < n; i++) 
        {
            int parent = dsu.find(i);
            if (!map.containsKey(parent)) 
            {
                if (ch > 'z') return "";
                map.put(parent, ch++);
            }
            res[i] = map.get(parent);
        }
        String word = new String(res);
        int[][] check = new int[n][n];
        for (int i = n - 1; i >= 0; i--) 
        {
            for (int j = n - 1; j >= 0; j--) 
            {
                if (word.charAt(i) == word.charAt(j)) 
                {
                    if (i == n - 1 || j == n - 1)
                        check[i][j] = 1;
                    else
                        check[i][j] = 1 + check[i + 1][j + 1];
                }
            }
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (check[i][j] != lcp[i][j]) 
                return "";
            }
        }
        return word;
    }
    class DSU 
    {
        int[] parent;
        DSU(int n) 
        {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int x) 
        {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }
        void union(int a, int b) 
        {
            int pa = find(a), pb = find(b);
            if (pa != pb) parent[pa] = pb;
        }
    }
}
