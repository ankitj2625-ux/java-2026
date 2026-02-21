package local;

public class SumOfNumber {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 1, 5};
        int total = 0;
        for (int num : arr) {
            total = total + num;
        }
        System.out.println(total);
    }
}
