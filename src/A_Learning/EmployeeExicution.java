package A_Learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeExicution {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ankit", "100", "male", "mumbai"));
        employeeList.add(new Employee("radhika", "200", "female", "pune"));
        employeeList.add(new Employee("aditya", "300", "male", "mumbai"));
        employeeList.add(new Employee("ram", "400", "male", "delhi"));
        employeeList.add(new Employee("pallavi", "500", "male", "pune"));
        employeeList.add(new Employee("deksha", "600", "male", "mumbai"));
        employeeList.add(new Employee("anuradha", "700", "male", "kolkate"));


        Optional<String> secondHeighst = employeeList
                .stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("second Heighst salary " + secondHeighst);


        //sort employee based on salary
        //find employee who name starts with a and belongs to city
        //reverse
//
//        List<Employee> employees = employeeList.stream()
//                .filter(emp -> emp.getName().startsWith("a"))
//                .filter(emp -> Integer.parseInt(emp.getSalary()) > 200) // convert String to int
//                .sorted(Comparator.comparing(
//                        emp -> Integer.parseInt(emp.getSalary()), Comparator.reverseOrder()))
//                .collect(Collectors.toList()); // collect into List
//
//        // Print result
//        employees.forEach(System.out::println);


//        List<Employee> employeeList1 = employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary)
//                        .thenComparing(Employee::getCity).reversed())
//                .collect(Collectors.toList());
//        System.out.println(employeeList1);
    }
}
