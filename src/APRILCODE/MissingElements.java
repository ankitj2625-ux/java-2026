package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 7, 11, 15);
        int min = 1;
        int max = 15;

        List<Integer> minMax = IntStream.rangeClosed(min, max)
                .filter(num -> !numbers.contains(num))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(minMax);
    }
}
