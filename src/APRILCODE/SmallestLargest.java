package APRILCODE;

import java.util.List;

public class SmallestLargest {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 6, 9, 8, 7, 5, 3, 2, 4, 5, 6, 8,2);

        Integer num = integers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println(num);

        Integer max = integers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(max);
    }
}
