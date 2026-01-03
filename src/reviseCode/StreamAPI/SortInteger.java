package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2, 6, 9, 8, 8, 5, 2, 2, 4);

        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> commonNum = numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(commonNum);
    }
}
