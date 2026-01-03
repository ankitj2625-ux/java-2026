package APRILCODE;

import java.util.List;
import java.util.stream.Collectors;

public class PrintFirstNumber {
    public static void main(String[] args) {
        List<String> stringList = List.of("ankit", "megha", "virat");
        List<Character> firstLetter = stringList.stream()
                .map(s -> s.charAt(0))
                .collect(Collectors.toList());
        System.out.println(firstLetter);
    }
}
