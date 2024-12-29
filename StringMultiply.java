class Solution
  {
    public String Multiply(String num1,String num2)
    {
      long a,b,c;
      String d;
      a=Long.parseLong(num1);
      b=Long..parseLong(num2);
      c=a*b;
      d=Long.toString(c);
      return d;
    }
    public static void main(String args[])
    {
      Solution obj=new Solution();
      String a="123";
      String b="456";
      System.out.println(obj.Multiply(a,b);
    }
  }
