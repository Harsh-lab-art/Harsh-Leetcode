class Solution {
    public long coloredCells(int n) {
        long res=n;
        return 1+(res-1)*res*2;
    }
}
