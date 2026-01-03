package INTERVIEW;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumberArrary {
    public static void main(String[] args) {

        int[] arr = {1, 6, 5, 3, 8, 9, 10};

        int sortedd = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(sortedd);

    }
}
