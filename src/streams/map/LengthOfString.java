package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        Long len = words.stream()
//                .map(String::length)
//                .count();
//        System.out.println(len);

        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
