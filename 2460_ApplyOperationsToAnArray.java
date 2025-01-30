import java.util.Arrays;
class Solution 
{
    public static int[] applyOperations(int[] nums) 
    {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) 
        {
            if (nums[i] == nums[i + 1]) 
            {
                nums[i] *= 2; 
                nums[i + 1] = 0; 
            }
        }
        int[] res = new int[n];
        int inx = 0;
        for (int m : nums) 
        {
            if (m != 0) 
            {
                res[inx++] = m;
            }
        }
        while (inx < n) 
        {
            res[inx++] = 0;
        }

        return res;
    }

    public static void main(String[] args) 
    {
        int[] n1 = {1, 2, 2, 1, 1, 0};
        int[] res1 = applyOperations(n1);
        System.out.println(Arrays.toString(res1)); 

        int[] n2 = {0, 1};
        int[] res2 = applyOperations(n2);
        System.out.println(Arrays.toString(res2)); 
    }
}
