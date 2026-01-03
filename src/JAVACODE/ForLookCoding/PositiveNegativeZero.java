package JAVACODE.ForLookCoding;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter anu number : ");
        int num = scanner.nextInt();

        if (num > 10)
            System.out.println(" is positive number");
        else if (num < 0) {
            System.out.println(" is negative number");
        } else
            System.out.println("zero");
    }
}
