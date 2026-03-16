class Solution 
{
    public int[] getBiggestThree(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        TreeSet<Integer> sums = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                sums.add(grid[i][j]);
                for (int L = 1; i - L >= 0 && i + L < m && j - L >= 0 && j + L < n; L++) 
                {
                    int currentSum = 0;
                    for (int k = 0; k < L; k++) 
                    {
                        currentSum += grid[i - L + k][j + k]; 
                        currentSum += grid[i + k][j + L - k]; 
                        currentSum += grid[i + L - k][j - k]; 
                        currentSum += grid[i - k][j - L + k]; 
                    }
                    sums.add(currentSum);
                }
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for (int s : sums) 
        {
            resultList.add(s);
            if (resultList.size() == 3) break;
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
