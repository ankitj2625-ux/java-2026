package local;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 8, 5, 3, 2, 1};
        int total = 0;

        for (int allTotal : arr) {
            total = total + allTotal;
        }
        System.out.println(total);
    }
}
