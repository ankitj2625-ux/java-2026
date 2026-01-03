package reviseCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighset {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 6, 9, 2, 6, 4);
        Optional<Integer> secondHigh = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();
        if (secondHigh.isPresent()) {
            System.out.println(secondHigh);
        } else {
            System.out.println("List done not have least elements");
        }
    }
}
