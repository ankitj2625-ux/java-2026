package APRILCODE;

import java.util.List;

public class SmallestNumberInList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 6, 8, 1, 3, 7);

        Integer num = integers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println(num);

    }
}
