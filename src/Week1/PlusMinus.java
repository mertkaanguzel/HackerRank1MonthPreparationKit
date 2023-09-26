package Week1;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int length = arr.toArray().length;
        int negative = 0;
        int positive = 0;
        int zero = 0;

        for (int i = 0; i < length; i++) {
            if (arr.get(i) > 0) positive++;
            if (arr.get(i) < 0) negative++;
            if (arr.get(i) == 0) zero++;
        }

        System.out.printf("%.6f%n", (double) positive / length);
        System.out.printf("%.6f%n",(double) negative / length);
        System.out.printf("%.6f%n",(double) zero / length);
    }
}
