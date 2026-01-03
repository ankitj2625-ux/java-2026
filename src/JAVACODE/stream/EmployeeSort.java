package JAVACODE.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ankit", "30", "25000"));
        employeeList.add(new Employee("rahul", "25", "35000"));
        employeeList.add(new Employee("virat", "31", "45000"));
        employeeList.add(new Employee("deepak", "28", "55000"));

        //Sorted By Name
//        List<Employee> sorted = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
//        System.out.println(sorted);

        //Assending Order
        List<Employee> sortedByAge = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedByAge);


        //Decending order
        List<Employee> sortedByAgeDecending = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge)
                        .reversed())
                .collect(Collectors.toList());

        System.out.println(sortedByAgeDecending);


        //Sorted by Name Ascending and Descending by Salary
        List<Employee> sortedNameAndSalary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .reversed().thenComparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(sortedNameAndSalary);


    }
}
