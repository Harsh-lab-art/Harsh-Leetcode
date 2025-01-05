class Solution 
{
    public double myPow(double x, int n) 
    {
     double pow=Math.pow(x,n);
     return pow;   
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        double a=obj.myPow(2.0000,10);
        System.out.println(a);

        double b=obj.myPow(2.10000,3);
        System.out.println(b);

        double c=obj.myPow(2.00000,-2);
        System.out.println(c);
    }
}
