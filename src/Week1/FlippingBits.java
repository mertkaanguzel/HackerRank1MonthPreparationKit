package Week1;

public class FlippingBits {
    public static long flippingBits(long n) {
        //return ~n & (long) ( Math.pow(2, 32) - 1);
        //return ~n & 0xffffffffL;
        return ((~n + 1) << 1);
    }
}
