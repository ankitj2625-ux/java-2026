package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoNEmptyAndLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "", "Stream", "API", "");
        List<Integer> stringList = strings.stream()
                .filter(names -> !names.isEmpty())
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(stringList);

    }
}
