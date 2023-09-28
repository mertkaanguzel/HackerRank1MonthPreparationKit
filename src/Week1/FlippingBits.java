package Week1;

public class FlippingBits {
    public static long flippingBits(long n) {
        return ~n & (long) ( Math.pow(2, 32) - 1);
        //return ~n & 0xffffffffL;
    }

    public static long _flippingBits(long n) {
        long result = 0;
        String num = "";

        while (n > 1) {
            String bit = (n % 2 == 1) ? "0" : "1";
            num = bit + num;
            n /= 2;
        }

        if (n == 1) {
            num = "0" + num;
        } else if (n == 0) {
            num = "1" + num;
        }

        for (int i = num.length() - 1; i >= 0; i--) {
            long bit = Character.getNumericValue(num.charAt(i));
            result = (result << 1) + bit;
        }

        long remainingOnes = (long) (Math.pow(2, 32 - num.length()) - 1) << num.length();
        return result + remainingOnes;
    }
}
