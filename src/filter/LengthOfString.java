package filter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfString {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("ankit", "akay", "vamika", "santosh", "sandeep", "mohan", "madhuri", "ankit", "akay");
//
//        //length of each String
//        list.stream().map(String::length).forEach(System.out::println);
//
//        //length of all String
//        Long lengthOfString = list.stream().map(num -> num.length()).count();
//        System.out.println(lengthOfString);
//
//        //count the number of String
//        Map<String, Long> countingString = list.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
//        countingString.forEach((names, count) -> System.out.println(names + " : " + count));

        //Loops
        List<String> stringList = Arrays.asList("ankit", "akay", "vamika", "santosh", "sandeep", "mohan", "madhuri", "ankit", "akay");

//        ************ MAP****************

        Map<String, Long> stringMap = new HashMap<>();

        for (String name : stringList) {
            if (stringMap.containsKey(name)) {
                stringMap.put(name, stringMap.get(name) + 1); // Increment count if name exists
            } else {
                stringMap.put(name, 1L); // Initialize count for new name
            }
        }
        for (Map.Entry<String, Long> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
