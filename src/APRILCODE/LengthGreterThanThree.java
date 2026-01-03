package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthGreterThanThree {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "API", "Filter");
        List<Integer> lengths = strings
                .stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);


        //Length greater than 3
        List<String> integerList = strings
                .stream()
                .filter(str -> str.length() > 3)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
