package codeCodeCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class A {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ankit", 32));
        employeeList.add(new Employee("rahul", 25));

        List<Employee> employeeList1 = employeeList.stream()
                .filter(emp -> emp.getAge() >= 28)
                .collect(Collectors.toList());

        for (Employee list : employeeList1) {
            System.out.println(list);
        }
    }
}
