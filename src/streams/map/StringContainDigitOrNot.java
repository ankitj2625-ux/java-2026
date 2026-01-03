package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringContainDigitOrNot {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("abc", "a1b", "123");

        List<Boolean> containedDigit = words.stream()
                .map(digit -> digit.matches(".*\\d.*"))
                .collect(Collectors.toList());

        System.out.println(containedDigit);
    }
}
