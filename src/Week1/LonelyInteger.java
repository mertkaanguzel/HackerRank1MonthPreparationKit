package Week1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        HashSet<Integer> nums = new HashSet<>();
        int sum = 0;
        int lonelySum = 0;

        for (Integer num : a) {
            sum += num;
            if (!nums.contains(num)) lonelySum += num;
            nums.add(num);
        }

        return lonelySum * 2 - sum;
    }
    public static int _lonelyinteger(List<Integer> a) {
        HashSet<Integer> nums = new HashSet<>();
        int sum = 0;

        for (Integer num : a) {
            sum += num;
            nums.add(num);
        }

        int sumOfSet = nums.stream().reduce(0, (subtotal, element) -> subtotal + element);

        return sumOfSet * 2 - sum;
    }

}
