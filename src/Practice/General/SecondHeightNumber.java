package Practice.General;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHeightNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 9, 2, 6, 4);

        int num = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(num);

    }
}
