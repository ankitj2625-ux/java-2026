package INTERVIEW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntToString {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<String> stringNumbers = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(stringNumbers);
    }
}
