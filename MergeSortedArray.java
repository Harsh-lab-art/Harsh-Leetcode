class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0)
        {
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int[] arr1={1,2,3,0,0,0};
        int a1=3;
        int[] arr2={2,5,6};
        int a2=3;
        obj.merge(arr1,a1,arr2,a2);
        System.out.println(java.util.Arrays.toString(arr1));
    }
}
