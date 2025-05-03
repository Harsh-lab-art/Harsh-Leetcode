import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prevSorted = "";

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String currSorted = new String(chars);

            if (!currSorted.equals(prevSorted)) {
                result.add(word);
                prevSorted = currSorted;
            }
        }

        return result;
    }
}
