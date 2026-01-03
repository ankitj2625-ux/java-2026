package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 0, 3, 10, -1, 20);

        System.out.println(numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList()));
    }
}

