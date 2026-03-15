class Fancy 
{
    private List<Long> list;
    private long add=0;
    private long mult=1;
    private static final int MOD=1_000_000_007;
    public Fancy() 
    {
        list =new ArrayList<>();
    }
    public void append(int val) 
    {
        long inv=power(mult,MOD-2);
        long neutralval=((val-add+MOD)%MOD*inv)%MOD;
        list.add(neutralval);    
    }
    public void addAll(int inc) 
    {
        add=(add+inc)%MOD;   
    }
    public void multAll(int m) 
    {
        mult=(mult*m)%MOD;
        add=(add*m)%MOD;   
    }
    public int getIndex(int idx) 
    {
        if(idx>=list.size()) return -1;
        return (int) ((list.get(idx)*mult%MOD+add)% MOD); 
    }
    private long power(long base, long exp)
    {
        long res=1;
        base%=MOD;
        while(exp >0)
        {
            if(exp %2==1)
            res=(res*base)%MOD;
            base=(base*base)%MOD;
            exp/=2;
        }
        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */
