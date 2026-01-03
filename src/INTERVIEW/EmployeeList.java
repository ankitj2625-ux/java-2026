package INTERVIEW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ankit", "300", "male", 20));
        employees.add(new Employee("vamika", "250", "female", 21));
        employees.add(new Employee("akay", "600", "male", 22));
        employees.add(new Employee("raj", "100", "male", 23));

//        List<Employee> employeeList = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary)
//                        .thenComparing(Employee::getSalary)
//                .thenComparing(Employee::getName).reversed())
//                .collect(Collectors.toList());

        List<Employee> employeeList1 = employees.stream()
                .filter(emp -> Integer.parseInt(emp.getSalary()) >= 250)
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(emp -> emp.getGender().equals("male"))
                        .thenComparing(emp -> emp.getName().startsWith("A"))
                        .reversed())
                .collect(Collectors.toList());

        for (Employee employee : employeeList1) {
            System.out.println(employee);
        }
    }
}
