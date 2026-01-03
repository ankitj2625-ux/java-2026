package conditions;

import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (num == 0)
            System.out.println("number is 0");
        else if (num > 0)

            System.out.println("number is +ve");
        else
            System.out.println("number is -ve");
    }
}
