package JAVACODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCode1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Ankit", "Bhaurao", "jibhakate");
        System.out.println(stringList.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
