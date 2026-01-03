package JAVACODE.ForLookCoding;

public class AllNegativeNumber {
    public static void main(String[] args) {
        int[] numbers = {3, -5, 7, -2, 0, -8, 4};

        int count = 0;
        for (int num : numbers) {
            if (num < 0)
                System.out.println(num + " is negative number");
        }

    }
}
