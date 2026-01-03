package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "anna", "steve", "bob");
        List<String> strings = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(strings);
    }
}
