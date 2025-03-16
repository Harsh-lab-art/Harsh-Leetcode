class Solution {
    public int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for (int num : nums) {
            int digitSum = getDigitSum(num);
            if (map.containsKey(digitSum)) {
                int prevNum = map.get(digitSum);
                ans = Math.max(prevNum + num, ans);
                map.put(digitSum, Math.max(prevNum, num));
            } else {
                map.put(digitSum, num);
            }
        }
        return ans;
    }
}
