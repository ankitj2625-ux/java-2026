package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumAndDouble {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-10, 5, 3, -2, 8, -1, 6);
        List<Integer> integerList = numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
