class Solution 
{
    public int closestTarget(String[] words, String target, int startIndex) 
    {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
            if (words[i].equals(target)) 
            {
                int clockwise = (i - startIndex + n) % n;
                int anticlockwise = (startIndex - i + n) % n;
                int dist = Math.min(clockwise, anticlockwise);
                minDist = Math.min(minDist, dist);
            }
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
