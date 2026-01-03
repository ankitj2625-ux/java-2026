package codeCodeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateEmelemtArray {
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 2, 5, 4, 5, 40};

        List<Integer> uniqueList = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
