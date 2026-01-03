package JAVACODE.ForLookCoding;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        System.out.println("Enter 1st number : ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Enter 2nd number : ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        if (num1 > num2)
            System.out.println("****    1st number is greater");
        else if (num2 > num1) {
            System.out.println("***    2nd number is greater ");
        } else
            System.out.println("both are equal");
    }
}
