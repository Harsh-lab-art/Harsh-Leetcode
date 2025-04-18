import java.util.*;
class Solution 
{
    public int minMovesToSeat(int[] seats, int[] students) 
    {
        Arrays.sort(seats);
        Arrays.sort(students);
        int mov=0;
        for(int i=0;i<seats.length;i++)
        {
            mov+=Math.abs(seats[i]-students[i]);
        }
        return mov;
    }
}
