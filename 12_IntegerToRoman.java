class Solution 
{
    public String intToRoman(int num) 
    {
      String[] rom={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
      StringBuilder res=new StringBuilder();
      for(int i=0;i<val.length;i++)
      {
        while(num>=val[i])
        {
            num-=val[i];
            res.append(rom[i]);
        }
      }
      return res.toString();  
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int a=3749;
        System.out.println(obj.intToRoman(a));
        int b=58;
        System.out.println(obj.intToRoman(b));
        int c=1994;
        System.out.println(obj.intToRoman(c));
    }
}
