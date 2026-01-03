package CODE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ram", "500"));
        employeeList.add(new Employee("kedar", "5500"));
        employeeList.add(new Employee("vishal", "300"));

        List<Employee> employees = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(employees);

    }
}
