package codeCodeCode;

import java.util.Arrays;

public class CountTheNumberOfDigitInArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 5, 2, 5, 2, 9};
        int total = 0;
        System.out.println(arr.length);

        System.out.println(Arrays.stream(arr).count());

        for (int num : arr) {
            total = total + num;
        }
        System.out.println(total);

    }
}
