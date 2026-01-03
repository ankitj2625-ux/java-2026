package codeCodeCode;

import java.util.Comparator;
import java.util.List;

public class Lengthh {
    public static void main(String[] args) {
//        List<String> list = List.of("a", "ab", "abc");
//        list.stream().filter(s -> s.length() > 1).forEach(System.out::println);



        List<String> names = List.of("Zoe", "Adam", "Bobbob");

        names.stream()
                .sorted()
                .forEach(System.out::println);

// Custom comparator
//        names.stream()
//                .sorted(Comparator.comparingInt(String::length))
//                .forEach(System.out::println);

    }
}
