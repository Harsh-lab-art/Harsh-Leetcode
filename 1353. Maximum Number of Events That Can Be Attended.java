//greedy
// job schedulin
//I need Priority Queue confirm
class Solution 
{
    public int maxEvents(int[][] events) 
    {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int d=1;
        int i=0;
        int res=0;
        int n=events.length;
        int md=0;
        for(int []eve:events)
        {
            md=Math.max(md,eve[1]);
        }
        for(d=1;d<=md;d++)
        {
            while(i<n && events[i][0]==d)
            {
                pq.offer(events[i][1]);
                i++;
            }
            while(!pq.isEmpty() && pq.peek()<d)
            {
                pq.poll();
            }
            if(!pq.isEmpty())
            {
                pq.poll();
                res++;
            }
        }
        return res;
    }
}
