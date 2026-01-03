package INTERVIEW;

public class CountTheNumberOfDigitInArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 5, 2, 5, 2, 9};
        int digitCount = 0;

        for (int num : arr) {
            digitCount += Integer.toString(num).length();
        }

        System.out.println("Total number of digits in array: " + digitCount);
    }
}

