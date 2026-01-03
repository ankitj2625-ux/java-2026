package codeCodeCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SencondLargestElement {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 9, 8, 8, 5, 5, 3, 3, 6, 6, 9, 9);
        Optional<Integer> secondLargest = integers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();
        System.out.println(secondLargest);
    }

}
