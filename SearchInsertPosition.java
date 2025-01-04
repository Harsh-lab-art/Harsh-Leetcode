class Solution 
{
    public static int searchInsert(int[] nums, int target) 
    {
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                l=l+1;
            }
            else
            {
                r=r-1;
            }
        }
            return l;
    }
            public static void main(String args[])
            {
                System.out.println(searchInsert(new int[]{1,3,5,6},5));
                System.out.println(searchInsert(new int[]{1,3,5,6},2));
                System.out.println(searchInsert(new int[]{1,3,5,6},7));
            }
}
