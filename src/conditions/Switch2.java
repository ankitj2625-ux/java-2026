package conditions;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade A, B, C, D, E, F");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("very good");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("fair");
                break;
            case 'E':
                System.out.println("need to study");
                break;
            default:
                System.out.println("no grade");
                sc.close();
        }
    }
}
