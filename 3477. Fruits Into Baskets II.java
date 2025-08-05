class Solution 
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int n=fruits.length;
        boolean used[]=new boolean[n];
        int not=0;
        for(int i=0;i<n;i++)
        {
            boolean place=false;
            for(int j=0;j<n;j++)
            {
                if(!used[j] && baskets[j]>=fruits[i])
                {
                    used[j]=true;
                    place=true;
                    break;
                }
            }
            if(!place)
            {
                not++;
            }
        }
        return not;
    }
}
