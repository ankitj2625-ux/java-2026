package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithFirstLetter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "API");
        List<Character> stringList = strings.stream()
                .map(start -> start.charAt(0))
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
