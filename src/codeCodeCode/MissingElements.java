package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class
MissingElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 35, 65);

        int min = 5;
        int max = 65;

        List<Integer> missingNumbers = IntStream.rangeClosed(min, max)
                .filter(num -> !numbers.contains(num))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(missingNumbers);
    }
}
