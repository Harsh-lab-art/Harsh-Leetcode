class Solution 
{
    public boolean hasAllCodes(String s, int k) 
    {
        int totalRequired = 1 << k;
        Set<String> foundCodes = new HashSet<>();
        if (s.length() - k + 1 < totalRequired) return false;
        for (int i = 0; i <= s.length() - k; i++) 
        {
            String sub = s.substring(i, i + k);
            foundCodes.add(sub);
            if (foundCodes.size() == totalRequired) return true;
        }
        return foundCodes.size() == totalRequired;
    }
}
