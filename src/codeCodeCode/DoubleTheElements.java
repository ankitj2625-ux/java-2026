package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  DoubleTheElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        List<Integer> integers = numbers.stream()
                .map(dou -> dou * 2)
                .collect(Collectors.toList());

        System.out.println(integers);
    }
}
