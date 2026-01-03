package CCCC_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringProgram {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Ankit singh", "radhika kohli", "pagati", "virat", "Rohit Sharma", "amol sinha");

        //UpperCase
        System.out.println(str.stream().map(String::toUpperCase).collect(Collectors.toList()));

        //Lower case
        System.out.println(str.stream().map(String::toLowerCase).collect(Collectors.toList()));

        //Starts with
        System.out.println(str.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList()));

        //Contains
        System.out.println(str.stream().filter(name -> name.contains("k")).collect(Collectors.toList()));

        //Ends With
        System.out.println(str.stream().filter(ends -> ends.endsWith("a")).collect(Collectors.toList()));

        //sort by Alphabets
        System.out.println(str.stream().sorted().collect(Collectors.toList()));

        //Reverse Order
        System.out.println(str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //Count names that have more than 5 characters
        System.out.println(str.stream().filter(len -> len.length() > 5).collect(Collectors.toList()));

        // Count the length
        System.out.println(str.stream().map(String::length).count());

        //Longest name in String
        System.out.println(str.stream().max(Comparator.comparingInt(String::length)).orElseThrow());

        // Convert all names to lowercase and remove duplicates
        System.out.println(str.stream().map(String::toLowerCase).distinct().collect(Collectors.toList()));

        //Check if any name starts with 'A' (case-insensitive)
        System.out.println(str.stream().filter(name -> name.toLowerCase().startsWith("a")).collect(Collectors.toList()));
    }
}
