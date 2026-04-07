class Robot 
{
    int width, height;
    int x, y;
    int dir;
    int[][] dirs = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    String[] names = {"East", "North", "West", "South"};
    public Robot(int width, int height) 
    {
        this.width = width;
        this.height = height;
        x = 0;
        y = 0;
        dir = 0; 
    }
    public void step(int num) 
    {
        int cycle = 2 * (width + height) - 4;
        num = num % cycle;
        if (num == 0) 
        {
            if (x == 0 && y == 0) 
            {
                dir = 3;
            }
            return;
        }

        while (num > 0) 
        {

            int nx = x + dirs[dir][0];
            int ny = y + dirs[dir][1];
            if (nx < 0 || nx >= width || ny < 0 || ny >= height) 
            {
                dir = (dir + 1) % 4;
            } 
            else 
            {
                x = nx;
                y = ny;
                num--;
            }
        }
    }
    public int[] getPos() 
    {
        return new int[]{x, y};
    }
    public String getDir() 
    {
        return names[dir];
    }
}
