package w;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private String salary;

    public Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return  Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}


class Result {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();


        // Adding Employee objects to the ArrayList

        employees.add(new Employee(1, "Alice", "30000"));

        employees.add(new Employee(2, "Bob", "250000"));

        employees.add(new Employee(3, "Alice", "350000"));

        //Result expected {3, Alice, 350000},2, Bob, 350000}


        List<Employee> sortedEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct().collect(Collectors.toList());
        System.out.println(sortedEmployee);


    }
}