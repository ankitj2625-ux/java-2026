package mock;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberRemove {
    public static void main(String[] args) {

        int arr[] = {5, 3, 6, 9, 3, 14, 4, 1, 7, 7, 1, 5};

        Set<Integer> integerSet = new HashSet<>();

        for (int num : arr) {
            integerSet.add(num);
        }
        System.out.println(integerSet);
    }
}
