package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfAllStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "API");

        List<Integer> integerList = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }

}
