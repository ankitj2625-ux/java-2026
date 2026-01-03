package reviseCode.String;

public class LargestElemnt {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 6, 5, 4, 8, 9};

        int largets = arr[0];

        for (int num : arr) {
            if (num > largets) {
                largets = num;
            }
        }
        System.out.println(largets);
    }
}
