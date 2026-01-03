package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ankit", "akay", "vamika", "santosh", "sandeep", "mohan", "madhuri");

        List<String> empty = new ArrayList<>();
        List<String> sortedName = list.stream().filter(strats -> strats.startsWith("a") || strats.startsWith("m")).collect(Collectors.toList());

        for (String namess : sortedName) {
            empty.add(namess);
        }

        System.out.println(empty);
    }
}
