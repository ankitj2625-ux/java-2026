package CCCC;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 9, 5, 5, 2, 5};
        Set<Integer> integerSet = new HashSet<>();
        for (int num : arr) {
            integerSet.add(num);
        }
        System.out.println(integerSet);

    }
}
