package local;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithFirstLetter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ankit", "Amit", "rahul", "pankaj", "aman", "Vijaya");
        List<String> filterName = names.stream()
                .filter(letter -> letter.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filterName.stream().collect(Collectors.joining(" ")));
    }
}
