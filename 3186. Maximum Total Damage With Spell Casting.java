class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> map = new HashMap<>();
        for (int p : power) {
            map.put(p, map.getOrDefault(p, 0L) + p);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int n = keys.size();
        long[] dp = new long[n];
        dp[0] = map.get(keys.get(0));

        for (int i = 1; i < n; i++) {
            long currDamage = map.get(keys.get(i));
             long skip = dp[i - 1];
             long take = currDamage;
            int j = i - 1;
            while (j >= 0 && keys.get(i) - keys.get(j) <= 2) j--;
            if (j >= 0) take += dp[j];

            dp[i] = Math.max(skip, take);
        }

        return dp[n - 1];
    
    }
}
