import java.util.*;
class Solution 
{
    public int[] sortEvenOdd(int[] nums) 
    {
        int n=nums.length;
        int even=(n+1)/2;
        int odd=n/2;
        int[]ev=new int[even];
        int[]od=new int[odd];
        for(int i=0,e=0,o=0;i<n;i++)
        {
            if(i%2==0)
            ev[e++]=nums[i];
            else
            od[o++]=nums[i];
        }
        Arrays.sort(ev);
        Arrays.sort(od);
        for(int i=0,e=0,o=od.length-1;i<n;i++)
        {
            if(i%2==0)
            nums[i]=ev[e++];
            else
            nums[i]=od[o--];
        }
        return nums;
    }
}
