package APRILCODE;

import java.util.List;

public class SumOfAllNumber {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 6, 9, 8, 7, 5, 3, 2, 4, 5, 6, 8, 2);

        Integer num = integers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("sum of all number : " + num);

        int[] arr = {6, 6, 1, 1, 2};
        System.out.println("length of Array : " + arr.length);
        int sum = 0;

        for (int numbers : arr) {
            sum = sum + numbers;
        }
        System.out.println("sum of all number of number : " + sum);
    }
}
