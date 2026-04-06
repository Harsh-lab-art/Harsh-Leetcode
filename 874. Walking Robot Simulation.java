class Solution 
{
    public int robotSim(int[] commands, int[][] obstacles) 
    {
        int[][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        int di=0;
        int x=0;
        int y=0;
        int mdis=0;
        Set<String>set=new HashSet<>();
        for(int [] obs:obstacles)
        {
            set.add(obs[0]+"#"+obs[1]);
        }
        for(int cmd:commands)
        {
            if(cmd==-1)
            {
                di=(di+1)%4;
            }
            else if(cmd==-2)
            {
                di=(di+3)%4;
            }
            else
            {
                for(int i=0;i<cmd;i++)
                {
                    int nx=x+dir[di][0];
                    int ny=y+dir[di][1];
                    if(set.contains(nx + "#" + ny))
                    {
                        break;
                    }
                    x=nx;
                    y=ny;
                    mdis=Math.max(mdis,x*x+y*y);
                }
            }
        }
        return mdis;
    }
}
