package AA;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 9, 7, 4, 5};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
