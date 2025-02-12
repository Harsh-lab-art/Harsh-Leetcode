class Solution 
{

    public static void main(String[] args) {
        int number = 19; 
        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }

    public static boolean isHappy(int n) {
        return isHappyHelper(n, 0);
    }

    private static boolean isHappyHelper(int n, int depth) {

        if (n == 1) {
            return true;
        }
        if (depth > 100) { 
            return false;
        }
        int sum = sumOfSquares(n);
        return isHappyHelper(sum, depth + 1);
    }

    private static int sumOfSquares(int num) {

        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (digit * digit) + sumOfSquares(num / 10);
    }
}
