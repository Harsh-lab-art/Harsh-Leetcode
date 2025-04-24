import java.util.*;
class Solution 
{
    public String decodeMessage(String key, String message) 
    {
        Map<Character,Character> map=new HashMap<>();
        char curr='a';
        for(char c:key.toCharArray())
        {
            if(c!=' ' && !map.containsKey(c))
            {
                map.put(c,curr);
                curr++;
                if(curr>'z')
                break;
            }
        }
        StringBuilder code=new StringBuilder();
        for(char c: message.toCharArray())
        {
            if(c==' ')
            {
                code.append(' ');
            }
            else
            {
                code.append(map.get(c));
            }
        }
        return code.toString();
    }
}
