package conditions;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit name");
        String fruit = sc.nextLine();
        switch (fruit) {
            case "banana":
                System.out.println("price Rs. 50 ");
                break;
            case "apple":
                System.out.println("price Rs. 50 ");
                break;
            case "guava":
                System.out.println("price Rs. 100 ");
                break;
            case "strawberry":
                System.out.println("price Rs. 225 ");
                break;
            case "orange":
                System.out.println("price Rs. 322 ");
                break;
            case "mango":
                System.out.println("price Rs. 444 ");
                break;
            case "kivi":
                System.out.println("price Rs. 500 ");
                break;
            default:
                System.out.println("no fruit found");
                sc.close();
        }
    }
}
