package A_Learning;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElements {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 5, 8, 12);
        int min = 3;
        int max = 12;

        List<Integer> missing = IntStream.rangeClosed(min, max)
                .filter(num -> !integers.contains(num))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(missing);
    }
}
