package Week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort1 {
    public static List<Integer> countingSort1(List<Integer> arr) {
        // Write your code here
        List<Integer> frequencies = new ArrayList<>(Collections.nCopies(100, 0));
        for (Integer num : arr) {
            frequencies.set(num, frequencies.get(num) + 1);
        }
        return frequencies;

    }
}
