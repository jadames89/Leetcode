public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int temp = x;
        int reversedNumber = 0;

        while (x > 0) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        return reversedNumber == temp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

}
