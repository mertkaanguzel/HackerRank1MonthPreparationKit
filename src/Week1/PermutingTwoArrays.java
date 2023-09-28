package Week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    public static String permutingTwoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(B);
        Collections.sort(A);
        int length = A.size();
        for (int i = 0; i < length; i++) {
            if (A.get(i) + B.get(length - i - 1) < k) return "NO";
        }
        return "YES";
    }

    // Not Works For All Cases
    public static String _permutingTwoArrays(int k, List<Integer> A, List<Integer> B) {
        int sumOfA = A.stream().reduce(0, (subtotal, element) -> subtotal + element);
        int sumOfB = B.stream().reduce(0, (subtotal, element) -> subtotal + element);
        //Collections.sort(B);
        //Collections.sort(A);
        System.out.println(A.size());
        System.out.println(sumOfA + sumOfB);
        return (sumOfA + sumOfB >= k * A.size()) ? "YES" : "NO";
    }

}
