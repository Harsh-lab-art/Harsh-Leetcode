class Solution 
{
    public int[] lexicographicallySmallestArray(int[] nums, int limit) 
    {
        int n=nums.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        ArrayList<Deque<Integer>>list=new ArrayList<>();
        HashMap<Integer,Integer>group=new HashMap<>();
        int groupIdx=0;
        list.add(new LinkedList<>());
        list.get(groupIdx).offer(temp[0]);
        group.put(temp[0],groupIdx);
        for(int i=1;i<n;i++)
        {
            if(temp[i]-list.get(groupIdx).peekLast()>limit)
            {
                groupIdx++;
                list.add(new LinkedList<>());
            }
            group.put(temp[i],groupIdx);
            list.get(groupIdx).offer(temp[i]);
        }
        for(int i=0;i<n;i++)
        {
            int gi=group.get(nums[i]);
            nums[i]=list.get(gi).poll();
        }
        return nums;
    }
}
