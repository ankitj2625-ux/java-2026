package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumStream {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 9, 8, 7, 4, 5, 2, 5, 8, 8, 8, 4, 5);
        List<Integer> sortedNum = integers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedNum);
    }
}
