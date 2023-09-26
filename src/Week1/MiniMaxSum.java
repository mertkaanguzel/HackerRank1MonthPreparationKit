package Week1;

import java.util.List;
public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int length = arr.toArray().length;
        long sum = 0;
        long maxNum = Long.MIN_VALUE;
        long minNum = Long.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr.get(i) < minNum) minNum = arr.get(i);
            if (arr.get(i) > maxNum) maxNum = arr.get(i);
            sum += arr.get(i);
        }
        System.out.println((sum - maxNum) + " " + (sum - minNum));
    }
}
