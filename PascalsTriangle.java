import java.util.ArrayList;
import java.util.List;
class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>>triangle=new ArrayList<>();
        for(int r=0;r<numRows;r++)
        {
            List<Integer>cr=new ArrayList<>();
            cr.add(1);
            if(r>0)
            {
                List<Integer>pr=triangle.get(r-1);
                for(int j=1;j<r;j++)
                {
                    cr.add(pr.get(j-1)+pr.get(j));
                }
                cr.add(1);
            }
            triangle.add(cr);
        }
        
    
      return triangle;
    }
public static void main(String args[])
{
    Solution obj=new Solution();
    int numRows=5;
    List<List<Integer>>res = obj.generate(numRows);
    for(List<Integer>r:res)
    {
        System.out.println(r);
    }
}
}
