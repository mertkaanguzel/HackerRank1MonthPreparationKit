import Week1.FlippingBits;

import java.util.*;

public class Main {

    public int solution(int[] A) {
        // Implement your solution here
        int smallest = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int num: A) {
            if (num > 0) set.add(num);
        }
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(i)) {
                smallest = A[i];
            }
        }
        return smallest;
    }


    public static void main(String[] args) {
        System.out.println(FlippingBits.flippingBits(0));
    }
}