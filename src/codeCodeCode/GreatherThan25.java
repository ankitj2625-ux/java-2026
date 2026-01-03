package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreatherThan25 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 35, 65);
        List<Integer> integers = numbers.stream()
                .filter(num -> num >= 25)
                .collect(Collectors.toList());

        System.out.println(integers);

    }
}
