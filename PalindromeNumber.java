class Solution
 {
    public boolean isPalindrome(int x) 
    {
        if (x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }

        int reversed = 0;
        while (x > reversed)
        {
            reversed = reversed * 10 + x % 10; 
            x /= 10; 
        }
        return x == reversed || x == reversed / 10;
    }
    public static void main(String[] args)
    {
        Solution obj= new Solution();
        System.out.println(obj.isPalindrome(121));  
        System.out.println(obj.isPalindrome(-121)); 
        System.out.println(obj.isPalindrome(10));   
    }
}
