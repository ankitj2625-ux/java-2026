package APRILCODE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employeee {
    private String name;
    private String salary;
    private int age;

    public Employeee(String name, String salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}

class EmployeeSort {
    public static void main(String[] args) {
        List<Employeee> employeeeArrayList = new ArrayList<>();

        employeeeArrayList.add(new Employeee("ankit", "100", 10));
        employeeeArrayList.add(new Employeee("nisha", "400", 20));
        employeeeArrayList.add(new Employeee("aditya", "300", 25));

        List<Employeee> employeeess = employeeeArrayList
                .stream()
                .sorted(Comparator.comparing(Employeee::getName).reversed()
                        .thenComparing(Employeee::getSalary))
                .collect(Collectors.toList());

        System.out.println(employeeess);

//**************************************************************************************************************

        List<Employeee> emp = employeeeArrayList
                .stream()
                .filter(emps -> Integer.parseInt(emps.getSalary()) > 100)
                .filter(emps -> emps.getAge() > 10)
                .sorted(Comparator.comparing(Employeee::getName).reversed()
                        .thenComparing(Employeee::getSalary))
                .collect(Collectors.toList());

        System.out.println(emp);

    }
}