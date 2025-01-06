import java.util.ArrayList;
import java.util.List;
class Solution 
{
    public static List<Integer> getRow(int rowIndex) 
    {
      List<Integer>r=new ArrayList<>();
      r.add(1);
      for(int i=1;i<=rowIndex;i++)
      {
        for(int j=i-1;j>0;j--)
        {
            r.set(j,r.get(j-1)+r.get(j));
        }
        r.add(1);
      }
      return r;   
    }
    public static void main(String args[])
    {
        int rI=1;
        int rI2=3;
        int rI3=0;
        System.out.println(getRow(rI));
        System.out.println(getRow(rI2));
        System.out.println(getRow(rI3));
    }
}
