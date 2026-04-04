class Solution 
{
    public String decodeCiphertext(String encodedText, int rows) 
    {
        if (rows == 1) 
        return encodedText;
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder res = new StringBuilder();
        for (int c = 0; c < cols; c++) 
        {
            int i = 0, j = c;
            while (i < rows && j < cols) 
            {
                res.append(encodedText.charAt(i * cols + j));
                i++;
                j++;
            }
        }
        int end = res.length() - 1;
        while (end >= 0 && res.charAt(end) == ' ') 
        end--;
        return res.substring(0, end + 1);
    }
}
