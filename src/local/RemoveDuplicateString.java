package local;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ankit", "hello", "ankit", "jibhakate");
        stringList.stream().distinct().forEach(System.out::println);
    }
}
