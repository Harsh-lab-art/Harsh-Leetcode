class Solution {
    public int maximumLength(int[] nums) {
        int oddCount = 0;
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int maxLenSameParitySum = Math.max(oddCount, evenCount);

        int dp_ending_even = 0;
        int dp_ending_odd = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                dp_ending_even = Math.max(dp_ending_even, dp_ending_odd + 1);
                dp_ending_even = Math.max(dp_ending_even, 1);
            } else {
                dp_ending_odd = Math.max(dp_ending_odd, dp_ending_even + 1);
                dp_ending_odd = Math.max(dp_ending_odd, 1);
            }
        }
        int maxLenAltParitySum = Math.max(dp_ending_even, dp_ending_odd);

        return Math.max(maxLenSameParitySum, maxLenAltParitySum);
    }
}
