package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  StartsWithAUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "John", "Steve", "Alice", "Bob");
        List<String> strings = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(strings);
    }
}
