class Solution 
{
    public String convertToBase7(int num) 
    {
        if(num==0)
        return "0";
        boolean isNegative=num<0;
        num=Math.abs(num);
        int sum=0;
        int place=1;
        while(num>0)
        {
            int dig=num%7;
            sum=sum+dig*place;
            place=place*10;
            num/=7;
        }
        return (isNegative?"-":"")+Integer.toString(sum);
    }
}
