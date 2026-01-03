package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class SumOfValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sumNumber = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sumNumber);
    }
}
