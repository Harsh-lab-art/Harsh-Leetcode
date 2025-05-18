class Solution 
{
    public boolean checkPerfectNumber(int num) 
    {
        int sum=0;
    
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return (sum==num)? true:false;
    }
public static void main(String[]args)
{
Solution obj=new Solution();
int n=28;
System.out.println(obj.checkPerfectNumber(n));
}
}
