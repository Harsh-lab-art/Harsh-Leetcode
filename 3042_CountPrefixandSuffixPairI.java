class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String word1 = words[i];
                String word2 = words[j];
                if (isPrefixAndSuffix(word1, word2)) {
                    c++;
                }
            }
        }

        return c;
    }

    public boolean isPrefixAndSuffix(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        if (l1 > l2) {
            return false;
        }

        boolean isPrefix = word2.startsWith(word1);
        boolean isSuffix = word2.endsWith(word1);

        return isPrefix && isSuffix;
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        String[] a = { "a", "aba", "ababa", "aa" };
        System.out.println(obj.countPrefixSuffixPairs(a));
    }

}
