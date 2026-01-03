package list;

import java.util.Arrays;
import java.util.List;

public class SumOFList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int sum = 0;
        for (Integer num : numbers) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
