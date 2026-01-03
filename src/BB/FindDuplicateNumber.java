package BB;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 8, 5, 3, 2, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) ;
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
