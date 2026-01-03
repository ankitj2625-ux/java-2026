package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "def", "", "ghi");

        System.out.println(strings.stream()
                .filter(emptys -> !emptys.isEmpty())
                .collect(Collectors.toList()));

    }
}
