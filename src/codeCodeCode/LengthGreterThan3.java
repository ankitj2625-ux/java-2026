package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  LengthGreterThan3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "API", "Filter");

        List<String> stringList = strings.stream()
                .filter(lengthss -> lengthss.length() > 3)
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
