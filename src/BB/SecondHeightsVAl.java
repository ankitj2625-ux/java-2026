package BB;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHeightsVAl {
    public static void main(String[] args) {
//        int[] arr = {5,6,9,8,3,2,1,5,88,55,66,77,99,11};
        List<Integer> list = Arrays.asList(5, 6, 9, 8, 3, 2, 1, 5, 55, 66, 77, 99, 11);
        Optional<Integer> num = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if (num.isPresent())
            System.out.println(num);
        else
            System.out.println("number not found !!!!");
    }
}
