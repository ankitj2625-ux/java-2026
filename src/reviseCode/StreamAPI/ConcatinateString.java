package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinateString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String con = words.stream().collect(Collectors.joining(", "));
        System.out.println(con);
    }
}
