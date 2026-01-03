package A_Learning;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatess {
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 2, 5, 4, 5, 40};

        Set<Integer> remove = new HashSet<>();
        for (int num : arr) {
            remove.add(num);
        }
        System.out.println(remove);


    }
}
