package Week1;

import java.util.List;

public class SubarrayDivision1 {
    public static int subarrayDivision1(List<Integer> s, int d, int m) {
        int length = s.size();
        int numOfWays = 0;
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < length; i++) {
            sum += s.get(i);
            counter++;

            if (counter == m) {
                if (sum == d) numOfWays++;
                sum -= s.get(i - m + 1);
                counter--;
            }
        }

        return numOfWays;
    }

    public static int _subarrayDivision1(List<Integer> s, int d, int m) {
        int length = s.size();
        int numOfWays = 0;

        for (int i = 0; i < (length - m + 1); i++) {
            int sumOfSubList = s.subList(i, i + m).stream().reduce(0, Integer::sum);
            if (sumOfSubList == d) numOfWays++;
        }

        return numOfWays;
    }
}
