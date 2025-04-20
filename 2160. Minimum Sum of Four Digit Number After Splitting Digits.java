import java.util.Arrays;
class Solution 
{
    public int minimumSum(int num) 
    {
        int dig[]=new int[4];
        for(int i=0;i<4;i++)
        {
            dig[i]=num%10;
            num=num/10;
        }
        Arrays.sort(dig);
        int n1 = dig[0] * 10 + dig[2];
        int n2 = dig[1] * 10 + dig[3];

        return n1 + n2;
    }
}
