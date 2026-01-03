package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("ankit" , "hello",  "ankit",  "jibhakate");
        List<String> list = stringList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
