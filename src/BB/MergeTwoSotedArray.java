package BB;

import java.util.Arrays;

public class MergeTwoSotedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        // Create merged array
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        // Output the merged array
        System.out.println("Merged Array: " + Arrays.toString(merged));

    }
}
