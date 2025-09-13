class Solution 
{
    public int maxFreqSum(String s) 
    {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> vowelCount = new HashMap<>();
        Map<Character, Integer> consonantCount = new HashMap<>();
        for (char ch : s.toCharArray()) 
        {
            if (vowels.contains(ch)) 
            {
                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
            } 
            else 
            {
                consonantCount.put(ch, consonantCount.getOrDefault(ch, 0) + 1);
            }
        }
        int maxVowel = vowelCount.values().stream().max(Integer::compare).orElse(0);
        int maxConsonant = consonantCount.values().stream().max(Integer::compare).orElse(0); 
        return maxVowel + maxConsonant;
    }
}
