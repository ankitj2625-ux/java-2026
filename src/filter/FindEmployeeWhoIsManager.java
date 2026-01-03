package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String role;

    public Employee(String ankit, String manager) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

public class FindEmployeeWhoIsManager {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ankit", "manager"));
        employees.add(new Employee("manisha", "IT"));
        employees.add(new Employee("pall avi", "developer"));
        employees.add(new Employee("raj", "developer"));
        employees.add(new Employee("mohan", "manager"));

        List<Employee> employeeList = employees.stream()
                .filter(emp -> "manager".equals(emp.getRole()))
                .collect(Collectors.toList());

        System.out.println(employeeList);

    }
}
