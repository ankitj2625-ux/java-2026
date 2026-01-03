package INTERVIEW;

public class Employee {
    private String name;
    private String salary;
    private String gender;
    private Integer Age;

    public Employee(String name, String salary, String gender, Integer age) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        Age = age;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", gender='" + gender + '\'' +
                ", Age=" + Age +
                '}';
    }
}
