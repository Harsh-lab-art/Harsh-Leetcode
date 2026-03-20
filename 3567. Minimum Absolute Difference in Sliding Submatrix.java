class Solution 
{
    public int[][] minAbsDiff(int[][] grid, int k) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int rows = m - k + 1;
        int cols = n - k + 1;
        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                List<Integer> elements = new ArrayList<>();
                for (int r = i; r < i + k; r++) 
                {
                    for (int c = j; c < j + k; c++) 
                    {
                        elements.add(grid[r][c]);
                    }
                }
                Collections.sort(elements);
                int minDiff = Integer.MAX_VALUE;
                boolean foundDifference = false;
                for (int idx = 1; idx < elements.size(); idx++) 
                {
                    int diff = Math.abs(elements.get(idx) - elements.get(idx - 1));
                    if (diff > 0) 
                    {
                        minDiff = Math.min(minDiff, diff);
                        foundDifference = true;
                    }
                }
                ans[i][j] = foundDifference ? minDiff : 0;
            }
        }
        return ans;
    }
}
