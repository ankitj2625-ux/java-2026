package DEMO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElementInArray {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 8);

        int min = 1;
        int max = 8;

        List<Integer> integerList = IntStream.rangeClosed(min, max)
                .filter(num -> !integers.contains(num))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(integerList);

    }
}
