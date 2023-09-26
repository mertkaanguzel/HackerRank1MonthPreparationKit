package Week1;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrays {
    public static List<Integer> sparseArrays(List<String> strings, List<String> queries) {
        HashMap<String, Integer> stringFreqs = new HashMap<>();

        strings.forEach(s -> {
            if (stringFreqs.putIfAbsent(s, 1) != null) {
                stringFreqs.put(s, stringFreqs.get(s) + 1);
            }
        });

        List<Integer> queryFreqs = queries.stream()
                .map(query -> stringFreqs.getOrDefault(query, 0))
                .collect(Collectors.toList());

        return queryFreqs;
    }
}
