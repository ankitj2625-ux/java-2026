package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "", "Stream", "API", "");

        List<Integer> newList = strings.stream()
                .filter(str -> !str.isEmpty())
                .map(String::length).collect(Collectors.toList());
        System.out.println(newList);
    }
}
