package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> uppcase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppcase);

    }
}
