public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums1 = { 1, 1, 2 };
        int k1 = obj.removeDuplicates(nums1);
        System.out.println(k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = obj.removeDuplicates(nums2);
        System.out.println(k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
