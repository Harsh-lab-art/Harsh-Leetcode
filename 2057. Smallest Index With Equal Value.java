class Solution 
{
    int first(int arr[])
    {
        int i;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(i%10==arr[i])
            {
                return i;
            }
            else if(i%10!=nums[i])
            
                return -1;
            }
        }
    }
    public int smallestEqual(int[] nums) 
    {
        int n=nums.length;
        
