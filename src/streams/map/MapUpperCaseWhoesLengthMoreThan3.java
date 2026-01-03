package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUpperCaseWhoesLengthMoreThan3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "dog");
        List<String> stringList = words.stream()
                .map(wo -> wo.length() > 3 ? wo.toUpperCase() : wo)
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
