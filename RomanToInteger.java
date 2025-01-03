import java.util.HashMap;
import java.util.Map;
class Solution 
 {
    public int romanToInt(String s) 
    {
      Map<Character,Integer>roman=new HashMap<>();
       roman.put('I',1);
       roman.put('V',5);
       roman.put('X',10);
       roman.put('L',50);
       roman.put('C',100);
       roman.put('D',500);
       roman.put('M',1000);
       int total=0;
       int prev=0;
       for(int i=s.length()-1;i>=0;i--)
       {
        char cc=s.charAt(i);
        int cv=roman.get(cc);
        if(cv<prev)
        {
            total-=cv;
        }
        else
        {
            total+=cv;
        }
        prev=cv;
       }
        return total;
    }
    
        public static void main(String args[])
        {
            Solution obj=new Solution();
            int res,res2,res3;
            String romanum="III";
            String romanum2="LVIII";
            String romanum3="MCMXCIV";
            res=obj.romanToInt(romanum);
            res2=obj.romanToInt(romanum2);
            res3=obj.romanToInt(romanum3);
            System.out.println(res);
            System.out.println(res2);
            System.out.println(res3);
        } 
    
}
