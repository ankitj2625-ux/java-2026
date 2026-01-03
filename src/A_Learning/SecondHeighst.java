package A_Learning;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHeighst {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 3, 6, 5, 2, 4, 8, 9, 5, 2, 5, 5);
        Optional<Integer> val = integers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(val);
    }

}
