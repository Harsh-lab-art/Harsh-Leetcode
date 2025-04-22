class Solution 
{
    public boolean checkDistances(String s, int[] distance) 
      {

        int[] firstPos = new int[26];

    
        for (int i = 0; i < 26; i++) 
        {
            firstPos[i] = -1;
        }

    
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);  
            int index = ch - 'a';      

            if (firstPos[index] == -1) 
            {
        
                firstPos[index] = i;
            } else 
            {
            
                int actualDistance = i - firstPos[index] - 1;
                if (actualDistance != distance[index]) 
                {
                    return false;
                }
            }
        }

        return true;
    }
}
