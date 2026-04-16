import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int q : queries) {
            int val = nums[q];
            List<Integer> list = map.get(val);
            if (list.size() == 1) {
                result.add(-1);
                continue;
            }
            int idx = Collections.binarySearch(list, q);
            int minDist = Integer.MAX_VALUE;
            int prevIdx = (idx - 1 + list.size()) % list.size();
            int prevPos = list.get(prevIdx);
            int nextIdx = (idx + 1) % list.size();
            int nextPos = list.get(nextIdx);
            int distPrev = Math.min(Math.abs(q - prevPos), n - Math.abs(q - prevPos));
            int distNext = Math.min(Math.abs(q - nextPos), n - Math.abs(q - nextPos));

            minDist = Math.min(distPrev, distNext);

            result.add(minDist);
        }

        return result;
    }
}
