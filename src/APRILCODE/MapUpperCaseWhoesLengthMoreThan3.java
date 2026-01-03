package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUpperCaseWhoesLengthMoreThan3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "dog", "orange", "rahul" ,"bal");
        List<String> stringList = words.stream()
                .filter(len -> len.length() > 3)
                .map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(stringList);

    }
}
