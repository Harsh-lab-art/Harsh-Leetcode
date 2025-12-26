class Solution 
{
    public int bestClosingTime(String customers) 
    {
        int pen=0;
        for (char c : customers.toCharArray())
        {
            if(c=='Y')
            {
                pen+=1;
            }
        }
        int minpen=pen;
        int best=0;
        for (int i=0;i<customers.length();i++)
        {
            if(customers.charAt(i)=='Y')
            {
                pen-=1;
            }
            else{
                pen++;
            }
            if(pen<minpen)
            {
                minpen=pen;
                best=i+1;
            }
            
        } 
        return best;   
    }
}
        
