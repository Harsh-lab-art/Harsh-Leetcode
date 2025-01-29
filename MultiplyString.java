class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] result = new int[len1 + len2];
        int temp = 0;
        for(int i = len1 - 1; i >= 0; i--){
            for(int j = len2 - 1; j >= 0; j--){
                temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + result[i + j + 1];
                result[i + j] += temp / 10;
                result[i + j + 1] = temp % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len1 + len2; i++){
            if(result[i] == 0 && sb.toString().length() == 0)
                continue;
            sb.append(result[i]);
        }
        if(sb.toString().length() == 0) return "0";
        return sb.toString();
    }
}
