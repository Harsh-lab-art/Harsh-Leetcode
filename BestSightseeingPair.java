class Solution 
{
    public int maxScoreSightseeingPair(int[] values) 
    {
        int max=0;
        int atI=values[0]+0;
        for(int i=1;i<values.length;i++)
        {
            max=Math.max(max,atI+values[i]-i);
            atI=Math.max(atI,values[i]+i);
        }
        return max;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int arr[]={8,1,5,2,6};
        System.out.println(obj.maxScoreSightseeingPair(arr));
        int arr2[]={1,2};
        System.out.println(obj.maxScoreSightseeingPair(arr2));

    }
}
