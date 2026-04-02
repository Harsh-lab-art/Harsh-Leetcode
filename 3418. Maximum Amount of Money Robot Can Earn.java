class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length, n = coins[0].length;

    
        int[][][] dp = new int[m][n][3];

        
        for (int[][] row : dp)
            for (int[] col : row)
                Arrays.fill(col, Integer.MIN_VALUE);

        
        dp[0][0][0] = coins[0][0];

        if (coins[0][0] < 0) {
            dp[0][0][1] = 0; 
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2; k++) {

                    if (dp[i][j][k] == Integer.MIN_VALUE) continue;

                    
                    if (j + 1 < n) {
                        process(dp, i, j + 1, k, dp[i][j][k], coins);
                    }

                    
                    if (i + 1 < m) {
                        process(dp, i + 1, j, k, dp[i][j][k], coins);
                    }
                }
            }
        }

        return Math.max(dp[m-1][n-1][0],
               Math.max(dp[m-1][n-1][1], dp[m-1][n-1][2]));
    }

    private void process(int[][][] dp, int i, int j, int k, int curr, int[][] coins) {
        int val = coins[i][j];

        if (val >= 0) {
            dp[i][j][k] = Math.max(dp[i][j][k], curr + val);
        } else {
            
            dp[i][j][k] = Math.max(dp[i][j][k], curr + val);

        
            if (k < 2) {
                dp[i][j][k + 1] = Math.max(dp[i][j][k + 1], curr);
            }
        }
    }
}
