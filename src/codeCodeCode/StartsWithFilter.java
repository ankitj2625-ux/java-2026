package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Steve", "Maria", "Anna", "Bob");

        System.out.println(names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList()));

        System.out.println(names.stream()
                .filter(name -> name.endsWith("b"))
                .collect(Collectors.toList()));

        List<String> result  = names.stream()
                .filter(name -> name.contains("ri"))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
