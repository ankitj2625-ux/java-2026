package A_Learning;

import java.util.List;
import java.util.stream.Collectors;

public class DoubleTheElement {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 3, 6, 5, 2, 4, 8, 9, 5, 2, 5, 5);
        List<Integer> dobEle = integers.stream()
                .map(dob -> dob * 2)
                .collect(Collectors.toList());
        System.out.println(dobEle);
    }
}
