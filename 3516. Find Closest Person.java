class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int p1=Math.abs(z-x);
        int p2=Math.abs(z-y);
        if(p1==p2)
        {
            return 0;
        }
        else if(p1>p2)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
}
