package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StratsWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "John", "Steve", "Alice", "Bob");

        //Starts With A
        List<String> newListFirstLetter = names
                .stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(newListFirstLetter);

        //All UpperCase
        List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
