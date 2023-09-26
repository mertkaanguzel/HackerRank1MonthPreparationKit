package Week1;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int length = arr.toArray().length;
        int left2RightSum = 0;
        int right2LeftSum = 0;
        for (int i = 0; i < length; i++) {
            left2RightSum += arr.get(i).get(i);
            right2LeftSum += arr.get(i).get(length - i - 1);
        }
        return Math.abs(left2RightSum - right2LeftSum);
    }
}
