import java.util.ArrayList;
import java.util.List;
class Solution 
{
    public List<String> stringMatching(String[] words) 
    {
      List<String> word=new ArrayList<>();
      for(int i=0;i<words.length;i++)
      {
        for(int j=0;j<words.length;j++)
        {
            if(i!=j && words[j].contains(words[i]))
            {
                word.add(words[i]);
                break;
            }
        }
      }
      return word;  
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        String words[]={"mass","as","hero","superhero"};
        System.out.println(obj.stringMatching(words));

        String words2[]={"leetcode","et","code"};
        System.out.println(obj.stringMatching(words2));

        String words3[]={"blue","green","bu"};
        System.out.println(obj.stringMatching(words3));
    }
}
