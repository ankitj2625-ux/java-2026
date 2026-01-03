package Practice.EmployeeStream;

public class Employee {

        private String name;
        private double salary;
        private int age;
        private String gender;

        // Constructor
        public Employee(String name, double salary, int age, String gender) {
            this.name = name;
            this.salary = salary;
            this.age = age;
            this.gender = gender;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + ", age=" + age + ", gender='" + gender + "'}";
        }
    }


