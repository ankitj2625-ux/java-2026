package AA;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = {5, 6, 9, 7, 8, 5, 8, 7, 7, 3, 3, 6, 6,};
        OptionalInt num = Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(arr.length - 2)
                .findFirst();
        if (num.isPresent())
            System.out.println(num.getAsInt());
        else
            System.out.println("number not found");
    }
}
