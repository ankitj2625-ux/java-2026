package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ankit", "hello", "ankit", "jibhakate");
        List<String> newList = stringList
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
