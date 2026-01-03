package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> sortedOrder = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedOrder);
    }
}
