package conditions;

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark");
        Integer mark = sc.nextInt();

        if (mark >= 35)
            System.out.println("student pass");
        else
            System.out.println("student fail");
    }
}
