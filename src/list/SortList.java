package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
