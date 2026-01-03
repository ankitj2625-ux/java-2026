package A_Learning;

import java.util.Arrays;
import java.util.List;

public class AdditionElements {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 3, 6, 9, 8);
        int sum = 0;

        for (int num : integers) {
            sum = sum + num;
        }
        System.out.println(sum);


//        int sum = integers.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
    }
}
