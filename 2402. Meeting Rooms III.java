import java.util.*;

class Solution 
{
    public int mostBooked(int n, int[][] meetings) 
    {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<long[]> busyRooms = new PriorityQueue<>((a, b) -> 
        {
                if (a[0] != b[0]) 
                {
                    return Long.compare(a[0], b[0]);
                }
                return Long.compare(a[1], b[1]);
            }
        );

        int[] roomCounts = new int[n];
        Queue<Integer> freeRooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) 
        {
            freeRooms.offer(i);
        }
        
        for (int[] meeting : meetings) 
        {
            int start = meeting[0];
            int end = meeting[1];
            long duration = end - start;

            while (!busyRooms.isEmpty() && busyRooms.peek()[0] <= start) 
            {
                long[] room = busyRooms.poll();
                freeRooms.offer((int)room[1]);
            }
            
            if (!freeRooms.isEmpty()) 
            {
                int roomNumber = freeRooms.poll();
                roomCounts[roomNumber]++;
                busyRooms.offer(new long[]{(long)end, roomNumber});
            } 
            else 
            { 
                long[] earliestEndingMeeting = busyRooms.poll();
                long newEnd = earliestEndingMeeting[0] + duration; 
                int roomNumber = (int)earliestEndingMeeting[1];
                roomCounts[roomNumber]++;
                busyRooms.offer(new long[]{newEnd, roomNumber});
            }
        }
        
        int maxRoom = 0;
        for (int i = 1; i < n; i++) 
        {
            if (roomCounts[i] > roomCounts[maxRoom]) 
            {
                maxRoom = i;
            }
        }
        return maxRoom;
    }
}
