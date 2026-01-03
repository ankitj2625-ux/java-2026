package A_Learning;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 3, 6, 5, 2, 4, 8, 9, 5, 2, 5, 5);
        List<Integer> duplicates = integers.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
