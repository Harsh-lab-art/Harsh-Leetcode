class Solution 
{
    public List<String> readBinaryWatch(int turnedOn) 
    {
        List<String> res=new ArrayList<>();
        for(int h=0;h<12;h++)
        {
            for(int m =0;m<60;m++)
            {
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn)
                {
                    String time =h+":"+(m<10?"0"+m:m);
                    res.add(time);
                }
            }
        }
        return res;
    }
}
