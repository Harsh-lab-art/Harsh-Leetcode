class Spreadsheet 
{
    public int[][] grid;
    public Spreadsheet(int rows) 
    {
        grid=new int [rows][26];
    }
    
    public void setCell(String cell, int value) 
    {
        int [] pos=parseCell(cell);
        grid[pos[0]][pos[1]]=value;
    }
    
    public void resetCell(String cell) 
    {
        int [] pos =parseCell(cell);
        grid[pos[0]][pos[1]]=0;
    }
    
    public int getValue(String formula) 
    {
        String s=formula.substring(1);
        String[] pa=s.split("\\+");
        int sum=0;
        for(String p:pa)
        {
            sum+=getOperandValue(p);
        }
        return sum;
    }
    public int getOperandValue(String s)
    {
        if(Character.isDigit(s.charAt(0)))
        {
            return Integer.parseInt(s);
        }
        int [] pos=parseCell(s);
        return grid[pos[0]][pos[1]];
    }
    public int[] parseCell(String cell)
    {
        int col =cell.charAt(0) -'A';
        int row = Integer.parseInt(cell.substring(1))-1;
        return new int[]{row,col};
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
