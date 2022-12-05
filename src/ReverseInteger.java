public class ReverseInteger {
    private static int reverseInteger(int num) {
        boolean negative = num < 0;
        long rev = 0;
        int absX = negative ? Math.abs(num) : num;

        while (absX > 0) {
            rev = rev * 10 + absX % 10;
            absX /= 10;
        }
        if (negative)
            rev *= -1;

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        else
            return (int) rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123456));
    }
}
