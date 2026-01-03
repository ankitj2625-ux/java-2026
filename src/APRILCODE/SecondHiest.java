package APRILCODE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHiest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 9, 8, 2, 6, 8, 70);

        Optional<Integer> num = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(num);
    }
}
