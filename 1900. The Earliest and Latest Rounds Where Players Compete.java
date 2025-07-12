import java.util.*;

class Solution 
{
    int[][][] dp;

    public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) 
    {
        dp = new int[n + 1][n + 1][n + 1];
        return dfs(n, firstPlayer, secondPlayer, 1);
    }

    private int[] dfs(int total, int a, int b, int round) 
    {
        if (a > b) return dfs(total, b, a, round);
        if (a + b == total + 1) return new int[]{round, round};

        if (dp[total][a][b] != 0) return decode(dp[total][a][b]);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (List<Integer> next : generateNextRounds(total, a, b)) 
        {
            int[] res = dfs(next.size(), findIndex(next, a), findIndex(next, b), round + 1);
            min = Math.min(min, res[0]);
            max = Math.max(max, res[1]);
        }

        dp[total][a][b] = encode(min, max);
        return new int[]{min, max};
    }

    private List<List<Integer>> generateNextRounds(int total, int a, int b) 
    {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(total, a, b, 1, total, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int total, int a, int b, int left, int right, List<Integer> current, List<List<Integer>> res) 
    {
        if (left > right) 
        {
            List<Integer> sorted = new ArrayList<>(current);
            Collections.sort(sorted);
            res.add(sorted);
            return;
        }

        if (left == right) 
        {
            current.add(left);
            backtrack(total, a, b, left + 1, right - 1, current, res);
            current.remove(current.size() - 1);
            return;
        }
        if ((left == a && right == b) || (left == b && right == a)) return;

        boolean isAB = (left == a || left == b || right == a || right == b);
        if (!isAB) 
        {
            current.add(left);
            backtrack(total, a, b, left + 1, right - 1, current, res);
            current.remove(current.size() - 1);

            current.add(right);
            backtrack(total, a, b, left + 1, right - 1, current, res);
            current.remove(current.size() - 1);
        } 
        else 
        {
            if (left == a || left == b) 
            {
                current.add(left);
                backtrack(total, a, b, left + 1, right - 1, current, res);
                current.remove(current.size() - 1);
            } 
            else 
            {
                current.add(right);
                backtrack(total, a, b, left + 1, right - 1, current, res);
                current.remove(current.size() - 1);
            }
        }
    }
    private int findIndex(List<Integer> list, int player) 
    {
        for (int i = 0; i < list.size(); i++) 
        {
            if (list.get(i) == player) return i + 1;
        }
        return -1;
    }

    private int encode(int a, int b) 
    {
        return a * 100 + b;
    }

    private int[] decode(int value) 
    {
        return new int[]{value / 100, value % 100};
    }
}
