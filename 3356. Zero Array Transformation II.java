class Solution 
{
    public:
    int minZeroArray(vector<int>& nums, vector<vector<int>>& queries) 
    {
        int n = nums.size();
        vector<int> differ(n + 1,0);
        int sum = 0;
        int pos = 0;
        for (int i = 0; i < n; i++) 
        {
            while (sum + differ[i] < nums[i])
            {
                if(pos==queries.size())
                return -1;
                int start=queries[pos][0];
                int end=queries[pos][1];
                int val=queries[pos][2];
                pos++;
                if(end<i)
                continue;
                differ[max(start,i)]+=val;
                differ[end+1]-=val;
            }
            sum+=differ[i];
        }
        return pos;
    }
};
