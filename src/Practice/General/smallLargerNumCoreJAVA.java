package Practice.General;

public class smallLargerNumCoreJAVA {
    public static void main(String[] args) {

        int[] arr = {5, 12, 9, 20, 7, 15};
        int smallest = arr[0];
        for (int num1 : arr) {
            if (num1 < smallest)
                smallest = num1;
        }
        System.out.println("smallest number is " +smallest);

    }
}
