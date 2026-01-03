package JAVACODE.Map;

import java.util.HashMap;
import java.util.Scanner;

public class SerachingBy {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID to search: ");
        int empId = sc.nextInt();

        if (employees.containsKey(empId)) {
            System.out.println("employee name : " + employees.get(empId));
        } else {
            System.out.println("Employee not found.");
        }
        sc.close();
    }
}
