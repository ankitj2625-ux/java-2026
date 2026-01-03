package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OprationOnEmployee {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ankit", 10000, "male"));
        employeeList.add(new Employee("raha", 20000, "female"));
        employeeList.add(new Employee("vamika", 30000, "female"));
        employeeList.add(new Employee("nandini", 40000, "female"));
        employeeList.add(new Employee("akay", 50000, "male"));

//        System.out.println(employeeList);
//
//        List<String> employees = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
//        System.out.println(employees);

//        var stringList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
//        System.out.println(stringList);


        List<Employee> employeeList1 = employeeList.stream().filter(employee -> employee.getSalary() > 40000).collect(Collectors.toList());
        System.out.println(employeeList1);
    }
}
