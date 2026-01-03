package reviseCode;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 9, 7, 4, 5};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {

                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
