package A_Learning;

public class TotalCount {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 9, 8, 2, 4};
        int total = 0;
        for (int num : arr) {
            total = total + num;
        }
        System.out.println(total);
    }
}
