import java.util.HashSet;
class Solution 
{
    public int distributeCandies(int[] candyType) 
    {
        HashSet<Integer>candy=new HashSet<>();
        for(int can:candyType)
        {
            candy.add(can);
        } 
        int maximum=candyType.length/2;
        int type=candy.size();
        return  Math.min(maximum,type);
    }
}
