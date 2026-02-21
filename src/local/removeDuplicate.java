package local;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 2, 5, 4, 5, 40};
        Arrays.stream(arr).sorted().distinct().forEach(System.out::println);
    }
}
