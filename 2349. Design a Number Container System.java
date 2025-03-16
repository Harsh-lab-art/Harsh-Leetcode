class NumberContainers 
{
    HashMap<Integer,TreeSet<Integer>>numtoidx=new HashMap<>();
    HashMap<Integer,Integer>idxtonum=new HashMap<>();
    public NumberContainers() 
    {
        numtoidx=new HashMap<>();
        idxtonum=new HashMap<>();
    }
    
    public void change(int index, int number) 
    {
        if(idxtonum.containsKey(index))
        {
            int prev=idxtonum.get(index);
            numtoidx.get(prev).remove(index);
            if(numtoidx.get(prev).size()==0)
            {
                numtoidx.remove(prev);
            }
        }
        idxtonum.put(index,number);
        if(!numtoidx.containsKey(number))
        {
            numtoidx.put(number,new TreeSet<>());
        }
        numtoidx.get(number).add(index);
    }
    
    public int find(int number) 
    {
        if(!numtoidx.containsKey(number))
        {
            return -1;
        }
        return numtoidx.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
