class FindSumPairs 
{
    int []nums1;
    int []nums2;
    Map<Integer,Integer>freq;

    public FindSumPairs(int[] nums1, int[] nums2) 
    {
        this.nums1=nums1;
        this.nums2=nums2;
        freq=new HashMap<>();
        for(int num: nums2)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) 
    {
        int od=nums2[index];
        int nw=od+val;//nums2[index]+=val;  
        freq.put(od,freq.get(od)-1);
        if(freq.get(od)==0)
        {
            freq.remove(od);
        }
        nums2[index]=nw;
        freq.put(nw,freq.getOrDefault(nw,0)+1);  
    }
    
    public int count(int tot) 
    {
        int c=0;
        for (int num:nums1)
        {
            int finalval=tot-num;
            c+=freq.getOrDefault(finalval,0);
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
