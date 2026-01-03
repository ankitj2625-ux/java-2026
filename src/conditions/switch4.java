package conditions;

import java.util.Scanner;

public class switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day :");
        String day = sc.nextLine();
        switch (day){
            case "monday":
                System.out.println("weekday");
                break;
            case "tuesday":
                System.out.println("weekday");
                break;
            case "wednesday":
                System.out.println("weekday");
                break;
            case "thurday":
                System.out.println("holiday");
                break;
            case "friday":
                System.out.println("weekday");
                break;
            case "saterday":
                System.out.println("weekend");
                break;
            case "sunday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("no day enter");
        }
    }
}
