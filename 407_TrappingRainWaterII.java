class Solution 
{
    public int trapRainWater(int[][] heightMap) 
    {
        int dir[][]={{0,-1},{0,1},{-1,0},{1,0}};
        int rows=heightMap.length;
        int cols=heightMap[0].length;
        int totalUnvisited=rows*cols;
        boolean[][] visited=new boolean[rows][cols];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        for(int i=0;i<rows;i++)
        {
            pq.offer(new int[]{heightMap[i][0],i,0});
            pq.offer(new int[]{heightMap[i][cols-1],i,cols-1});
            visited[i][0]=true;
            visited[i][cols-1]=true;
            totalUnvisited--;
            totalUnvisited--;
        }
        for(int i=1;i<cols-1;i++)
        {
            pq.offer(new int[]{heightMap[0][i],0,i});
            pq.offer(new int[]{heightMap[rows-1][i],rows-1,i});
            visited[0][i]=true;
            visited[rows-1][i]=true;
            totalUnvisited--;
            totalUnvisited--;
        }
        int trapwater=0;
        int waterheight=0;
        while(!pq.isEmpty() && totalUnvisited>0)
        {
            int currcell[]=pq.poll();
            int currheight=currcell[0];
            int currrow=currcell[1];
            int currcol=currcell[2];
            waterheight=Math.max(waterheight,currheight);
            for(int d=0;d<4;d++)
            {
                int neighrow=currrow+dir[d][0];
                int neighcol=currcol+dir[d][1];
                if(isValidCell(neighrow,neighcol,rows,cols)&& ! visited[neighrow][neighcol])
                {
                    int neighheight=heightMap[neighrow][neighcol];
                    if(neighheight<waterheight)
                    {
                        trapwater+=waterheight-neighheight;
                    }
                    pq.offer(new int[]{neighheight,neighrow,neighcol});
                    visited[neighrow][neighcol]=true;
                    totalUnvisited--;
                }
            }
        }
        return trapwater;
    }
    public boolean isValidCell(int row,int col,int rows,int cols)
    {
        return row>=0 && col>=0 && row<rows && col<cols;
    }
}
