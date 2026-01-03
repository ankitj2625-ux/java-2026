package AA;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {55,99,44,66,77,88,99,99};
        Set<Integer> duplicate = new HashSet<>();
        for (int num : arr) {
            duplicate.add(num);
        }
        System.out.println(duplicate);
    }
}
