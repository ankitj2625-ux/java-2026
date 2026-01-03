package reviseCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {5, 6, 5, 3, 5, 2, 3, 6, 9, 7, 4, 1};
        Set<Integer> integerSet = new HashSet<>();
        for (int num : arr) {
            integerSet.add(num);
        }
        System.out.println(integerSet);
    }
}
