package codeCodeCode;

public class SmallestNumberCoreJAVA {
    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 20, 7, 15};
        int smallest = arr[0];
        for (Integer num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println(smallest);

        ///////////////////////////////////////////

        int largest = arr[0];
        for (Integer num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);

    }
}
